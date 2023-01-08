package day27encapsulationabstraction;

public class SixGraders extends Courses {




    @Override
    public void math() {
        System.out.println("seventh graders math..");
    }

    @Override
    public void art() {
        super.art();
    }
}
