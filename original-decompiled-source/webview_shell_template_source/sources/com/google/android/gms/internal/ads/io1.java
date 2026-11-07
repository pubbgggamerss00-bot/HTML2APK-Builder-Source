package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class io1 implements Iterator {
    public static final io1 s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ io1[] f5816t;

    static {
        io1 io1Var = new io1("INSTANCE", 0);
        s = io1Var;
        f5816t = new io1[]{io1Var};
    }

    public static io1[] values() {
        return (io1[]) f5816t.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        sl1.h("no calls to next() since the last call to remove()", false);
    }
}
