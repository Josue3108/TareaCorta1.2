public abstract class EnemyShip {

    private String name;
    private double dps;

    public String getName(){ return name;}
    public void setName(String newName){ name = newName;}

    public double getDps(){ return  dps;}
    public void setDps(double newDps){ dps = newDps;}

    public void followHeroShip(){
        System.out.println(getName() + " Is following the hero");

    }

    public void displayEnemyShip(){
        System.out.println(getName() + " Is on the screen");

    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getDps());

    }
}
