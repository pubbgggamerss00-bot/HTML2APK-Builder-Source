package t8;

import android.net.Uri;
import s8.e2;

/* loaded from: classes.dex */
public final class f0 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f28215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f28216b;

    public f0(p5.x xVar, x xVar2) {
        this.f28215a = xVar;
        this.f28216b = xVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke() {
        String strA;
        x xVar = this.f28216b;
        Long l10 = xVar.f28561e;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            e2.c.f24633c.getClass();
            strA = "ai_session?prompt=&mode=chat&projectId=" + jLongValue;
            if (strA == null) {
                e2.c cVar = e2.c.f24633c;
                String str = xVar.f28557a;
                cVar.getClass();
                strA = m3.a.a("ai_session?prompt=&mode=chat&projectId=0&sessionId=", Uri.encode(str));
            }
        }
        p5.x.c(strA, this.f28215a);
        return pg.f0.f21461a;
    }
}
