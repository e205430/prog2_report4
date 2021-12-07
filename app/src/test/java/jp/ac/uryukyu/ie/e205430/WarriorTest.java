package jp.ac.uryukyu.ie.e205430;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {

        Warrior demoWarrior = new Warrior("デモ勇者", 100, 50);
        Enemy slime = new Enemy("スライムもどき", 100, 30);
        int currentEnemyHp;

        for(int i=0; i<3; i++){
            currentEnemyHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            slime.attack(demoWarrior);
            assertEquals((int)(demoWarrior.getAttack() * 1.5), currentEnemyHp - slime.getHitPoint());
        }
    }
}
