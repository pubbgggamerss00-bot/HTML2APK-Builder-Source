package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class j72 extends AbstractMap {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f5962y = 0;
    public Object[] s;

    /* renamed from: t, reason: collision with root package name */
    public int f5963t;

    /* renamed from: u, reason: collision with root package name */
    public Map f5964u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5965v;

    /* renamed from: w, reason: collision with root package name */
    public volatile i72 f5966w;

    /* renamed from: x, reason: collision with root package name */
    public Map f5967x;

    public void a() {
        if (this.f5965v) {
            return;
        }
        this.f5964u = this.f5964u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f5964u);
        this.f5967x = this.f5967x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f5967x);
        this.f5965v = true;
    }

    public final Set b() {
        return this.f5964u.isEmpty() ? Collections.EMPTY_SET : this.f5964u.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((e72) this.s[iE]).setValue(obj);
        }
        h();
        if (this.s == null) {
            this.s = new Object[16];
        }
        int i6 = -(iE + 1);
        if (i6 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f5963t == 16) {
            e72 e72Var = (e72) this.s[15];
            this.f5963t = 15;
            g().put(e72Var.s, e72Var.f4151t);
        }
        Object[] objArr = this.s;
        int length = objArr.length;
        System.arraycopy(objArr, i6, objArr, i6 + 1, 15 - i6);
        this.s[i6] = new e72(this, comparable, obj);
        this.f5963t++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f5963t != 0) {
            this.s = null;
            this.f5963t = 0;
        }
        if (this.f5964u.isEmpty()) {
            return;
        }
        this.f5964u.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f5964u.containsKey(comparable);
    }

    public final e72 d(int i6) {
        if (i6 < this.f5963t) {
            return (e72) this.s[i6];
        }
        throw new ArrayIndexOutOfBoundsException(i6);
    }

    public final int e(Comparable comparable) {
        int i6 = this.f5963t;
        int i7 = i6 - 1;
        int i8 = 0;
        if (i7 >= 0) {
            int iCompareTo = comparable.compareTo(((e72) this.s[i7]).s);
            if (iCompareTo > 0) {
                return -(i6 + 1);
            }
            if (iCompareTo == 0) {
                return i7;
            }
        }
        while (i8 <= i7) {
            int i9 = (i8 + i7) / 2;
            int iCompareTo2 = comparable.compareTo(((e72) this.s[i9]).s);
            if (iCompareTo2 < 0) {
                i7 = i9 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i9;
                }
                i8 = i9 + 1;
            }
        }
        return -(i8 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f5966w == null) {
            this.f5966w = new i72(this);
        }
        return this.f5966w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j72)) {
            return super.equals(obj);
        }
        j72 j72Var = (j72) obj;
        int size = size();
        if (size == j72Var.size()) {
            int i6 = this.f5963t;
            if (i6 != j72Var.f5963t) {
                return entrySet().equals(j72Var.entrySet());
            }
            for (int i7 = 0; i7 < i6; i7++) {
                if (d(i7).equals(j72Var.d(i7))) {
                }
            }
            if (i6 != size) {
                return this.f5964u.equals(j72Var.f5964u);
            }
            return true;
        }
        return false;
    }

    public final Object f(int i6) {
        h();
        Object[] objArr = this.s;
        Object obj = ((e72) objArr[i6]).f4151t;
        System.arraycopy(objArr, i6 + 1, objArr, i6, (this.f5963t - i6) - 1);
        this.f5963t--;
        if (!this.f5964u.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.s;
            int i7 = this.f5963t;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i7] = new e72(this, (Comparable) entry.getKey(), entry.getValue());
            this.f5963t++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f5964u.isEmpty() && !(this.f5964u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5964u = treeMap;
            this.f5967x = treeMap.descendingMap();
        }
        return (SortedMap) this.f5964u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((e72) this.s[iE]).f4151t : this.f5964u.get(comparable);
    }

    public final void h() {
        if (this.f5965v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i6 = this.f5963t;
        int iHashCode = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode += this.s[i7].hashCode();
        }
        return this.f5964u.size() > 0 ? this.f5964u.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return f(iE);
        }
        if (this.f5964u.isEmpty()) {
            return null;
        }
        return this.f5964u.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5964u.size() + this.f5963t;
    }
}
