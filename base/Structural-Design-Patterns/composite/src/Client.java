import entity.District;

public class Client {

    public static void main(String[] args) {
        District china = new District("中国", "000000", "");

        District shandong = new District("山东省","370000","");
        District heilongjiang = new District("黑龙江省","230000","");
        china.addChildren(shandong);
        china.addChildren(heilongjiang);

        District yantai = new District("烟台市","370600","");
        shandong.addChildren(yantai);
        District laiyang = new District("莱阳县","370682","");
        yantai.addChildren(laiyang);
        District jiamusi = new District("佳木斯市","230800","");
        heilongjiang.addChildren(jiamusi);

        System.out.println(china);
    }
}
