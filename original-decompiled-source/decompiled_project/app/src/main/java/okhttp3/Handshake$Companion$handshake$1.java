package okhttp3;

import eh.a;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class Handshake$Companion$handshake$1 extends s implements a<List<? extends Certificate>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f19248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$handshake$1(List<? extends Certificate> list) {
        super(0);
        this.f19248a = list;
    }

    @Override // eh.a
    public final List<? extends Certificate> invoke() {
        return this.f19248a;
    }
}
