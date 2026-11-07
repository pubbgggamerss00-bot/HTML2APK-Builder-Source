package t0;

/* loaded from: classes.dex */
public final class za {

    /* renamed from: a, reason: collision with root package name */
    public final h0.a f27596a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.a f27597b;

    /* renamed from: c, reason: collision with root package name */
    public final h0.a f27598c;

    /* renamed from: d, reason: collision with root package name */
    public final h0.a f27599d;

    /* renamed from: e, reason: collision with root package name */
    public final h0.a f27600e;

    public za() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        return kotlin.jvm.internal.r.a(this.f27596a, zaVar.f27596a) && kotlin.jvm.internal.r.a(this.f27597b, zaVar.f27597b) && kotlin.jvm.internal.r.a(this.f27598c, zaVar.f27598c) && kotlin.jvm.internal.r.a(this.f27599d, zaVar.f27599d) && kotlin.jvm.internal.r.a(this.f27600e, zaVar.f27600e);
    }

    public final int hashCode() {
        return this.f27600e.hashCode() + ((this.f27599d.hashCode() + ((this.f27598c.hashCode() + ((this.f27597b.hashCode() + (this.f27596a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f27596a + ", small=" + this.f27597b + ", medium=" + this.f27598c + ", large=" + this.f27599d + ", extraLarge=" + this.f27600e + ')';
    }

    public za(int i10) {
        h0.e eVar = ya.f27478a;
        h0.e eVar2 = ya.f27479b;
        h0.e eVar3 = ya.f27480c;
        h0.e eVar4 = ya.f27481d;
        h0.e eVar5 = ya.f27482e;
        this.f27596a = eVar;
        this.f27597b = eVar2;
        this.f27598c = eVar3;
        this.f27599d = eVar4;
        this.f27600e = eVar5;
    }
}
