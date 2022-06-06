public class test {
/**dlp测试项目123**/
        static float x = 205F;

        static float y = 572F;
/** 代码检啊是参加中考测**/
        private static boolean sound = true;

        public BattleAppearing() {
        }
    /** 测试3456案三大啊手机打开实际库存**/
        public static void draw(Graphics g) {
            if (sound) {
                sound = false;
            }
            if (y > 428F)
                g.drawImage(GamePanel.heroImage, (int) x, (int) y, null);
            else if (y <= 428F) {
                GamePanel.AppearingFlag = false;
                x = 205F;
                y = 572F;
                sound = true;
            }
            y -= 2.0F;
        }
}
