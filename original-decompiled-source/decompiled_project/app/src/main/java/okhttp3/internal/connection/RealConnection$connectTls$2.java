package okhttp3.internal.connection;

import eh.a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import okhttp3.Handshake;
import qg.p;

/* loaded from: classes2.dex */
final class RealConnection$connectTls$2 extends s implements a<List<? extends X509Certificate>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RealConnection f19505a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f19505a = realConnection;
    }

    @Override // eh.a
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake = this.f19505a.f19488e;
        r.b(handshake);
        List<Certificate> listA = handshake.a();
        ArrayList arrayList = new ArrayList(p.h(listA, 10));
        for (Certificate certificate : listA) {
            r.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
