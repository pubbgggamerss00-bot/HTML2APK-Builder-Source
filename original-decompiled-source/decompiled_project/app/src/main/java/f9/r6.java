package f9;

import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l f10373b;

    public /* synthetic */ r6(int i10, eh.l lVar) {
        this.f10372a = i10;
        this.f10373b = lVar;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10372a) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    this.f10373b.invoke(uri);
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f10373b.invoke(bool);
                break;
        }
        return pg.f0.f21461a;
    }
}
