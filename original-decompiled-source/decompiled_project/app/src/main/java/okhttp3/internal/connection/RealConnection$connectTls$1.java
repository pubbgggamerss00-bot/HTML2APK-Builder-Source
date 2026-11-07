package okhttp3.internal.connection;

import eh.a;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: classes2.dex */
final class RealConnection$connectTls$1 extends s implements a<List<? extends Certificate>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f19502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handshake f19503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Address f19504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f19502a = certificatePinner;
        this.f19503b = handshake;
        this.f19504c = address;
    }

    @Override // eh.a
    public final List<? extends Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner = this.f19502a.f19180b;
        r.b(certificateChainCleaner);
        return certificateChainCleaner.a(this.f19504c.f19157h.f19258d, this.f19503b.a());
    }
}
