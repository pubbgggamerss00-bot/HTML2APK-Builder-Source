package androidx.room;

import com.basitce.htmltoapk.data.apkgenerator.BuildHost;

/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3096a;

    public /* synthetic */ w0(int i10) {
        this.f3096a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f3096a) {
            case 0:
                h6.d statement = (h6.d) obj;
                kotlin.jvm.internal.r.e(statement, "statement");
                rg.g gVar = new rg.g();
                while (statement.t0()) {
                    gVar.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return qg.n0.a(gVar);
            default:
                return BuildHost.sha256$lambda$10(((Byte) obj).byteValue());
        }
    }
}
