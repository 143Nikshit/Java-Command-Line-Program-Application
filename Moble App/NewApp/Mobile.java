class Mobile
{
    Oppo oppo;
    Vivo vivo;
    Samsung samsung;
    Iphone iphone;
    
    public Oppo storeOppoRef(Oppo oppo)
    {
        this.oppo = oppo;
        return oppo;
    }
    public Vivo storeVivoRef(Vivo vivo)
    {
        this.vivo = vivo;
        return vivo;
    }
    public Samsung storeSamsungRef(Samsung samsung)
    {
        this.samsung = samsung;
        return samsung;
    }
    public Iphone storIphoneRef(Iphone iphone)
    {
        this.iphone = iphone;
        return iphone;
    }
}