package okhttp3;

import eh.a;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.s;
import qg.z;

/* loaded from: classes2.dex */
public final class Handshake$peerCertificates$2 extends s implements a<List<? extends Certificate>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f19249a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$peerCertificates$2(a<? extends List<? extends Certificate>> aVar) {
        super(0);
        this.f19249a = (s) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eh.a, kotlin.jvm.internal.s] */
    @Override // eh.a
    public final List<? extends Certificate> invoke() {
        try {
            return (List) this.f19249a.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return z.f22752a;
        }
    }
}
