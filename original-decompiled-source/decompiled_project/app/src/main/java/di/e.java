package di;

import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes2.dex */
public final class e extends c5.p {

    /* renamed from: a, reason: collision with root package name */
    public final ei.b f7999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8001c;

    public e(f fVar, String str) {
        this.f8000b = fVar;
        this.f8001c = str;
        this.f7999a = fVar.f8006b.f16437b;
    }

    @Override // c5.p, ci.e
    public final void H(int i10) {
        b0(Integer.toUnsignedString(i10));
    }

    @Override // c5.p, ci.e
    public final void K(long j10) {
        b0(Long.toUnsignedString(j10));
    }

    @Override // ci.e
    public final ei.b a() {
        return this.f7999a;
    }

    public final void b0(String s10) {
        kotlin.jvm.internal.r.e(s10, "s");
        this.f8000b.d0(this.f8001c, new kotlinx.serialization.json.r(s10, false, null));
    }

    @Override // c5.p, ci.e
    public final void l(short s10) {
        b0(String.valueOf(s10 & HPKE.aead_EXPORT_ONLY));
    }

    @Override // c5.p, ci.e
    public final void n(byte b10) {
        b0(String.valueOf(b10 & 255));
    }
}
