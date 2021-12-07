package jp.ac.uryukyu.ie.e205430;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    
    /**
     * 敵のHPを取得
     * @return　敵のHP
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * 敵の攻撃力を取得
     * @return　敵の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }


    /**
     * 敵の名前を変更
     * @param inputName 敵の名前
     */
    public void setName(String inputName){
        this.name = inputName;
    }

    /**
     * 敵のHPを変更
     * @param inputHitPoint 敵のHP
     */
    public void setHitPoint(int inputHitPoint){
        this.hitPoint = inputHitPoint;
    }

    /**
     * 敵の攻撃力を変更
     * @param inputAttack 敵の攻撃力
     */
    public void setAttack(int inputAttack){
        this.attack = inputAttack;
    }

    /**
     * 敵の死亡判定を変更
     * @param boolDead 敵の死亡判定
     */
    public void setDead(boolean boolDead){
        this.dead = boolDead;
    }


}