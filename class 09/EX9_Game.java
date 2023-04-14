import java.util.ArrayList;

public class EX9_Game {

    public static void main(String[] args) {
        Team blueTeam = new Team();
        Team redTeam = new Team();

        // 팀별 player 구성 예제
        blueTeam.addCharacter(new Warrior("블루1", 20, 6)); // 전사 : 랜덤한 적 1명 공격
        blueTeam.addCharacter(new Archer("블루2", 18, 4)); // 궁수 : 체력이 낮은 적 1명 공격
        blueTeam.addCharacter(new Magician("블루3", 16, 8)); // 마법사 : 광역 공격

        redTeam.addCharacter(new Warrior("레드1", 20, 6));
        redTeam.addCharacter(new Archer("레드2", 18, 4));
        redTeam.addCharacter(new Magician("레드3", 16, 8));

        System.out.println("전투 시작!\n");

        int winner = 0;

        for (int i = 0; i < 50; ++i) // 한 팀 빼고 전부 전멸할 때까지 계속한다. 단, 50턴이 지나면 무승부.
        {
            blueTeam.printInfo();
            redTeam.printInfo();
            System.out.println();

            blueTeam.attack(redTeam);
            redTeam.attack(blueTeam);

            // 한 팀이 전멸하면 break 키워드로 반복문 탈출.
            if (blueTeam.isDead()) {
                if (!redTeam.isDead()) {
                    winner = 2;
                }
                break;
            } else if (redTeam.isDead()) {
                winner = 1;
                break;
            }
        }

        // 어느 팀이 이겼는지 결과를 출력한다.
        blueTeam.printInfo();
        redTeam.printInfo();
        System.out.println();

        switch (winner) {
            case 1:
            	System.out.println("블루 팀 승리!");
            case 2:
            	System.out.println("레드 팀 승리!");
            case 0:
            	System.out.println("무승부!");
        }
    }
}

abstract class Character {
    String name;
    int hp;
    int maxHp;
    int maxValue;

    public Character(String name, int hp, int maxValue) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.maxValue = maxValue;
    }

    public int roll() {
        return (int) (Math.random() * maxValue) + 1;
    }

    public boolean isDead() {
        return (hp <= 0); // true 또는 false로 반환되는 식 자체를 넣었습니다.
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void damaged(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }

    public void printInfo() {
        System.out.println(name + " " + hp + "/" + maxHp);
    }

    abstract public void attack(Team enemy);

    public void attack(Character enemy) {
        int damage = roll();
        System.out.println(name + "이(가) " + enemy.getName() + "을(를) " + damage + "의 피해로 공격했습니다!");
        enemy.damaged(damage);
    }

    public void attackCommand(Team enemy_team) {
    }
}

class Warrior extends Character {
    public Warrior(String name, int hp, int maxValue) {
        super(name, hp, maxValue);
    }

    public void attack(Team enemy_team) {
        // todo : 랜덤한 적 1명을 공격하는 함수를 구현해주세요.
    	int i = (int)(Math.random() * enemy_team.players.size());
    	super.attack(enemy_team.players.get(i));
    }
}

class Archer extends Character {
    public Archer(String name, int hp, int maxValue) {
        super(name, hp, maxValue);
    }

    public void attack(Team enemy_team) {
        // todo : 체력이 가장 낮은 적 1명을 공격하는 함수를 구현해주세요.
    	int a = 100;
    	if(hp > 0) {
    		for(Character enemy : enemy_team.players) {
    			if(enemy.hp < a) {
    				a = enemy.hp;
    			}
    		}
    		for(Character target : enemy_team.players) {
    			if(target.hp == a) {
    				super.attack(target);
    				return;
    			}
    		}
    	}
    }
}

class Magician extends Character {
    public Magician(String name, int hp, int maxValue) {
        super(name, hp, maxValue);
    }

    public void attack(Team enemy_team) {
        // todo : 모든 적을 공격하는 함수를 구현해주세요.
    	if(hp > 0) {
    		for(Character target : enemy_team.players) {
    			super.attack(target);
    		}
    	}
    }
}

class Team {
    ArrayList<Character> players = new ArrayList<Character>();

    public ArrayList<Character> getCharacterList() {
        return players;
    }

    public void addCharacter(Character c) {
        players.add(c);
    }

    public void attack(Team enemy_team) {
        for (Character player : players) {
            player.attack(enemy_team);
        }

        // 죽은 적 삭제
        enemy_team.removeDeathPlayer();
    }

    public void removeDeathPlayer() {
        players.removeIf(Character::isDead); // ArrayList인 players에 있는 모든 Character 객체를 검사하여 isDead 함수가 true로 반환된 모든 Character 객체를 삭제합니다.
        // Character 클래스에 bool 자료형을 반환하는 isDead 함수를 만들어서 체력이 0 이하면 true, 아니면 false를 반환하게 해주세요.
    }

    public boolean isDead() {
        return players.isEmpty();
    }

    public void printInfo() {
        for (Character player : players) {
            player.printInfo();
        }
    }
}

