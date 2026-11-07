package q8;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22386b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f22385a = i10;
        this.f22386b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22385a) {
            case 0:
                x xVar = (x) this.f22386b;
                if (!xVar.N) {
                    xVar.e();
                    break;
                }
                break;
            default:
                w6.e.c((w6.e) this.f22386b);
                break;
        }
    }
}
