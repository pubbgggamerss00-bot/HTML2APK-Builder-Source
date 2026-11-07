package i0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.s implements eh.l<a2.c, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(i2 i2Var, m0.x2 x2Var) {
        super(1);
        this.f13539a = i2Var;
        this.f13540b = x2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(a2.c cVar) {
        boolean z10;
        KeyEvent keyEvent = cVar.f17a;
        if (this.f13539a.a() == v1.f13647b && keyEvent.getKeyCode() == 4) {
            z10 = true;
            if (a2.d.b(keyEvent) == 1) {
                this.f13540b.e(null);
            }
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
