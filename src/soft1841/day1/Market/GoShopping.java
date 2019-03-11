package soft1841.day1.Market;

/**
 * zengyue 19.03.10
 */

public class GoShopping {
    public static void main(String[] args){
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods ="七匹狼西服";
        market.shop();
        market = new TaobaoMarket();
        market.name ="淘宝";
        market.goods = "韩都衣舍花裙";
        market.shop();
    }
}
