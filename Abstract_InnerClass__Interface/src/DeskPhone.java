public class DeskPhone implements ITelephone {
    private int phoneNumber;
    private boolean isRinging;

    public DeskPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone doesn't have a power button!");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing" +
                phoneNumber +
                " on deskphone!");
    }

    @Override
    public void answer() {
        if (this.isRinging) {
            System.out.println("Answering the desk phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.phoneNumber) {
            this.isRinging = true;
            System.out.println("Ring Ring!!");
        } else {
            this.isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
