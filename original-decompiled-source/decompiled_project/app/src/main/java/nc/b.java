package nc;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class b<T> extends e1<T> {
    private T next;
    private a state = a.f18662b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18661a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f18662b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f18663c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f18664d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f18665e;

        static {
            a aVar = new a("READY", 0);
            f18661a = aVar;
            a aVar2 = new a("NOT_READY", 1);
            f18662b = aVar2;
            a aVar3 = new a("DONE", 2);
            f18663c = aVar3;
            a aVar4 = new a("FAILED", 3);
            f18664d = aVar4;
            f18665e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f18665e.clone();
        }
    }

    private boolean tryToComputeNext() {
        this.state = a.f18664d;
        this.next = computeNext();
        if (this.state == a.f18663c) {
            return false;
        }
        this.state = a.f18661a;
        return true;
    }

    public abstract T computeNext();

    public final T endOfData() {
        this.state = a.f18663c;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a aVar = this.state;
        if (aVar == a.f18664d) {
            throw new IllegalStateException();
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return tryToComputeNext();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = a.f18662b;
        T t3 = this.next;
        this.next = null;
        return t3;
    }

    public final T peek() {
        if (hasNext()) {
            return this.next;
        }
        throw new NoSuchElementException();
    }
}
