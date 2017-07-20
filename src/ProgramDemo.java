/**
 * Created by aibar on 7/20/2017.
 */
public class ProgramDemo {
    public static void main(String[] args) {
        ProgramConfiguration config = ProgramConfiguration.getInstance();

        config.setConnectionLimit(3000);
        config.setPortNumber(500);
        config.setURL("cosreo");
        config.setTimeout(10);

        System.out.println(config.getConnectionLimit() + " " + config.getPortNumber() + " " + config.getURL() + " " + config.getTimeout());


        //ProgramConfiguration config2 = new ProgramConfiguration();
//        config2.setTimeout(10);
//        System.out.println(config2.getTimeout());
    }
}
