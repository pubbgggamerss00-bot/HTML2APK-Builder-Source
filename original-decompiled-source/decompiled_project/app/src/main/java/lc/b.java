package lc;

import java.util.Iterator;
import java.util.NoSuchElementException;
import lc.c;
import lc.r;

/* loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public a f16933a;

    /* renamed from: b, reason: collision with root package name */
    public String f16934b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16935a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f16936b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f16937c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f16938d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f16939e;

        static {
            a aVar = new a("READY", 0);
            f16935a = aVar;
            a aVar2 = new a("NOT_READY", 1);
            f16936b = aVar2;
            a aVar3 = new a("DONE", 2);
            f16937c = aVar3;
            a aVar4 = new a("FAILED", 3);
            f16938d = aVar4;
            f16939e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f16939e.clone();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a aVar;
        String string;
        c cVar;
        a aVar2 = this.f16933a;
        a aVar3 = a.f16938d;
        if (aVar2 == aVar3) {
            throw new IllegalStateException();
        }
        int iOrdinal = aVar2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.f16933a = aVar3;
        r.a aVar4 = (r.a) this;
        int i10 = aVar4.f16961e;
        while (true) {
            int length = aVar4.f16961e;
            aVar = a.f16937c;
            if (length == -1) {
                aVar4.f16933a = aVar;
                string = null;
                break;
            }
            o oVar = (o) aVar4;
            c.b bVar = oVar.f16952g.f16953a;
            CharSequence charSequence = oVar.f16959c;
            int length2 = charSequence.length();
            g8.w.f(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            CharSequence charSequence2 = aVar4.f16959c;
            if (length == -1) {
                length = charSequence2.length();
                aVar4.f16961e = -1;
            } else {
                aVar4.f16961e = length + 1;
            }
            int i11 = aVar4.f16961e;
            if (i11 == i10) {
                int i12 = i11 + 1;
                aVar4.f16961e = i12;
                if (i12 > charSequence2.length()) {
                    aVar4.f16961e = -1;
                }
            } else {
                while (true) {
                    cVar = aVar4.f16960d;
                    if (i10 >= length || !cVar.a(charSequence2.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                while (length > i10 && cVar.a(charSequence2.charAt(length - 1))) {
                    length--;
                }
                int i13 = aVar4.f16962f;
                if (i13 == 1) {
                    length = charSequence2.length();
                    aVar4.f16961e = -1;
                    while (length > i10 && cVar.a(charSequence2.charAt(length - 1))) {
                        length--;
                    }
                } else {
                    aVar4.f16962f = i13 - 1;
                }
                string = charSequence2.subSequence(i10, length).toString();
            }
        }
        this.f16934b = string;
        if (this.f16933a == aVar) {
            return false;
        }
        this.f16933a = a.f16935a;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16933a = a.f16936b;
        T t3 = (T) this.f16934b;
        this.f16934b = null;
        return t3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
