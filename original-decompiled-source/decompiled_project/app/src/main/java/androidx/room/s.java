package androidx.room;

import i0.u2;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f3077a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3078b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f3079c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3080d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3081a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f3082b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f3083c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f3084d;

        static {
            a aVar = new a("NO_OP", 0);
            f3081a = aVar;
            a aVar2 = new a("ADD", 1);
            f3082b = aVar2;
            a aVar3 = new a("REMOVE", 2);
            f3083c = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f3084d = aVarArr;
            u2.e(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f3084d.clone();
        }
    }

    public s(int i10) {
        this.f3078b = new long[i10];
        this.f3079c = new boolean[i10];
    }

    public final boolean a(int[] tableIds) {
        kotlin.jvm.internal.r.e(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f3077a;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.f3078b;
                long j10 = jArr[i10];
                jArr[i10] = 1 + j10;
                if (j10 == 0) {
                    z10 = true;
                    this.f3080d = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(int[] tableIds) {
        kotlin.jvm.internal.r.e(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f3077a;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.f3078b;
                long j10 = jArr[i10];
                jArr[i10] = j10 - 1;
                if (j10 == 1) {
                    z10 = true;
                    this.f3080d = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }
}
