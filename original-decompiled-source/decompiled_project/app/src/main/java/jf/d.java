package jf;

/* loaded from: classes2.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final cf.d f15714a;

    public d() {
        this.f15714a = new cf.d();
    }

    @Override // jf.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cf.d Z() {
        return this.f15714a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f15714a.equals(((d) obj).f15714a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15714a.hashCode();
    }

    public d(cf.d dVar) {
        this.f15714a = dVar;
    }
}
