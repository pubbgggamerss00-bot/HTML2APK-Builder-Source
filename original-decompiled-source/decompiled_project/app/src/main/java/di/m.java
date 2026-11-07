package di;

import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes2.dex */
public final class m extends k {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8053c;

    public m(z zVar, boolean z10) {
        super(zVar);
        this.f8053c = z10;
    }

    @Override // di.k
    public final void b(byte b10) {
        if (this.f8053c) {
            h(String.valueOf(b10 & 255));
        } else {
            f(String.valueOf(b10 & 255));
        }
    }

    @Override // di.k
    public final void d(int i10) {
        boolean z10 = this.f8053c;
        String unsignedString = Integer.toUnsignedString(i10);
        if (z10) {
            h(unsignedString);
        } else {
            f(unsignedString);
        }
    }

    @Override // di.k
    public final void e(long j10) {
        boolean z10 = this.f8053c;
        String unsignedString = Long.toUnsignedString(j10);
        if (z10) {
            h(unsignedString);
        } else {
            f(unsignedString);
        }
    }

    @Override // di.k
    public final void g(short s10) {
        if (this.f8053c) {
            h(String.valueOf(s10 & HPKE.aead_EXPORT_ONLY));
        } else {
            f(String.valueOf(s10 & HPKE.aead_EXPORT_ONLY));
        }
    }
}
