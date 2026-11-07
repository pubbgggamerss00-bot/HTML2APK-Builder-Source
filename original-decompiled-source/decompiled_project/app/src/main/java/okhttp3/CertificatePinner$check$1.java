package okhttp3;

import eh.a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import okhttp3.internal.tls.CertificateChainCleaner;
import qg.p;

/* loaded from: classes2.dex */
public final class CertificatePinner$check$1 extends s implements a<List<? extends X509Certificate>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f19182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f19183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List<? extends Certificate> list, String str) {
        super(0);
        this.f19182a = certificatePinner;
        this.f19183b = list;
        this.f19184c = str;
    }

    @Override // eh.a
    public final List<? extends X509Certificate> invoke() throws SSLPeerUnverifiedException {
        CertificateChainCleaner certificateChainCleaner = this.f19182a.f19180b;
        List<Certificate> listA = this.f19183b;
        if (certificateChainCleaner != null) {
            listA = certificateChainCleaner.a(this.f19184c, listA);
        }
        ArrayList arrayList = new ArrayList(p.h(listA, 10));
        for (Certificate certificate : listA) {
            r.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
