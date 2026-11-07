package x3;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f32053a;

    /* renamed from: b, reason: collision with root package name */
    public int f32054b;

    public c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f32053a = new Object[i10];
    }

    public T a() {
        int i10 = this.f32054b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f32053a;
        T t3 = (T) objArr[i11];
        r.c(t3, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f32054b--;
        return t3;
    }

    public boolean b(T instance) {
        Object[] objArr;
        boolean z10;
        r.e(instance, "instance");
        int i10 = this.f32054b;
        int i11 = 0;
        while (true) {
            objArr = this.f32053a;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (objArr[i11] == instance) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f32054b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = instance;
        this.f32054b = i12 + 1;
        return true;
    }
}
