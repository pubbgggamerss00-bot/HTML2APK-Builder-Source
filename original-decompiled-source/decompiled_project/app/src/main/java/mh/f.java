package mh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f implements Iterator<String>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f18259a;

    /* renamed from: b, reason: collision with root package name */
    public int f18260b;

    /* renamed from: c, reason: collision with root package name */
    public int f18261c;

    /* renamed from: d, reason: collision with root package name */
    public int f18262d;

    /* renamed from: e, reason: collision with root package name */
    public int f18263e;

    public f(CharSequence string) {
        kotlin.jvm.internal.r.e(string, "string");
        this.f18259a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f18260b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f18263e < 0) {
            this.f18260b = 2;
            return false;
        }
        CharSequence charSequence = this.f18259a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f18261c; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f18260b = 1;
                this.f18263e = i10;
                this.f18262d = length;
                return true;
            }
        }
        i10 = -1;
        this.f18260b = 1;
        this.f18263e = i10;
        this.f18262d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18260b = 0;
        int i10 = this.f18262d;
        int i11 = this.f18261c;
        this.f18261c = this.f18263e + i10;
        return this.f18259a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
