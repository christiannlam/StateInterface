public class RobotBasic implements State
{
    private String state;

    public void setState (String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    public void doAction()
    {
        if(state.equalsIgnoreCase("Happy"))
        {
            System.out.println("Hi I'm Roboto and I'm cooking some instant ramen");
        }
        else if ( state.equalsIgnoreCase("Boring"))
        {
            System.out.println("A B C D E F G");
            state = "Happy";
        }
    }
}

