class OLA{
    Cab cab;   // This shows HAS-A relationship (OLA has a Cab)
    public Cab storeCabRef(Cab cab)
    {
        this.cab = cab;
        return cab;
    }
}