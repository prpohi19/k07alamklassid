class Bmw extends Engine{
    double displacement;
    double revs;
    public void Rotations(double displacement, double revs){
        this.displacement = displacement;
        this.revs = revs;
        System.out.println("This BMW engine has a displacement of "+displacement+"L and revs to "+revs+" RPM.");
    }
}
