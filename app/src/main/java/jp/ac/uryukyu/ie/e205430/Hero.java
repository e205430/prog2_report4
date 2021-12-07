package jp.ac.uryukyu.ie.e205430;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }


    

    /**
     * 自身のHPを取得
     * @return　自身のHP
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * 自身の攻撃力を取得
     * @return　自身の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }


    /**
     * 自身の名前を変更
     * @param inputName 自身の名前
     */
    public void setName(String inputName){
        this.name = inputName;
    }

    /**
     * 自身のHPを変更
     * @param inputHitPoint 自身のHP
     */
    public void setHitPoint(int inputHitPoint){
        this.hitPoint = inputHitPoint;
    }

    /**
     * 自身の攻撃力を変更
     * @param inputAttack 自身の攻撃力
     */
    public void setAttack(int inputAttack){
        this.attack = inputAttack;
    }

    /**
     * 自身の生死判定を変更
     * @param boolDead 自身の生死判定
     */
    public void setDead(boolean boolDead){
        this.dead = boolDead;
    }

}