public class Robot
{
    public static void main(String[] args)
    {
        RobotBasic robot = new RobotBasic();

        System.out.println("Robot is Happy: ");
        robot.setState("Happy");
        robot.doAction();

        System.out.println("\nRobot is Boring: ");
        robot.setState("boring");
        robot.doAction();

    }
}
