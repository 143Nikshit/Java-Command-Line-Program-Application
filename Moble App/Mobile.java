public class Mobile {
    Iphone iphone;
    Samsung samsung;
    Oppo oppo;
    Vivo vivo;
    Phone phone;

    
    public Iphone storePhoneRef(Iphone iphone)
    {
        this.iphone = iphone;
        return iphone;
    }
    public Samsung storePhoneRef(Samsung samsung)
    {
        this.samsung = samsung;
        return samsung;
    }
    public Oppo storePhoneRef(Oppo oppo)
    {
        this.oppo = oppo;
        return oppo;
    }
    public Vivo storePhoneRef(Vivo vivo)
    {
        this.vivo = vivo;
        return vivo;
    }
}
