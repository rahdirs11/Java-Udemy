public class MobilePhone implements ITelephone{
    private int phoneNumber;
    private boolean isRinging, isOn = false;

    public MobilePhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Phone is powered up!");
    }

    @Override
    public void dial(int phoneNumber) {
        if (this.isOn) {
            System.out.println("Now ringing " +
                    this.phoneNumber +
                    " on mobile phone");
        } else {
            System.out.println("Phone is switched Off");
        }
    }

    @Override
    public void answer() {
        if (this.isRinging) {
            System.out.println("Answering the mobile phone!");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.phoneNumber && this.isOn) {
            this.isRinging = true;
            System.out.println("Melody Ring...");
        } else {
            this.isRinging = false;
        }
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
