package b9;

/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4132a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f4132a) {
            case 0:
                num.intValue();
                return num;
            default:
                return Integer.valueOf(num.intValue() / 8);
        }
    }
}
