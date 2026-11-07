package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class k8 extends AbstractMap {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f11801y = 0;
    public Object[] s;

    /* renamed from: t, reason: collision with root package name */
    public int f11802t;

    /* renamed from: u, reason: collision with root package name */
    public Map f11803u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11804v;

    /* renamed from: w, reason: collision with root package name */
    public volatile j8 f11805w;

    /* renamed from: x, reason: collision with root package name */
    public Map f11806x;

    public void a() {
        if (this.f11804v) {
            return;
        }
        this.f11803u = this.f11803u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f11803u);
        this.f11806x = this.f11806x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f11806x);
        this.f11804v = true;
    }

    public final Set b() {
        return this.f11803u.isEmpty() ? Collections.EMPTY_SET : this.f11803u.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((h8) this.s[iE]).setValue(obj);
        }
        h();
        if (this.s == null) {
            this.s = new Object[16];
        }
        int i6 = -(iE + 1);
        if (i6 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f11802t == 16) {
            h8 h8Var = (h8) this.s[15];
            this.f11802t = 15;
            g().put(h8Var.s, h8Var.f11769t);
        }
        Object[] objArr = this.s;
        int length = objArr.length;
        System.arraycopy(objArr, i6, objArr, i6 + 1, 15 - i6);
        this.s[i6] = new h8(this, comparable, obj);
        this.f11802t++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f11802t != 0) {
            this.s = null;
            this.f11802t = 0;
        }
        if (this.f11803u.isEmpty()) {
            return;
        }
        this.f11803u.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f11803u.containsKey(comparable);
    }

    public final h8 d(int i6) {
        if (i6 < this.f11802t) {
            return (h8) this.s[i6];
        }
        throw new ArrayIndexOutOfBoundsException(i6);
    }

    public final int e(Comparable comparable) {
        int i6 = this.f11802t;
        int i7 = i6 - 1;
        int i8 = 0;
        if (i7 >= 0) {
            int iCompareTo = comparable.compareTo(((h8) this.s[i7]).s);
            if (iCompareTo > 0) {
                return -(i6 + 1);
            }
            if (iCompareTo == 0) {
                return i7;
            }
        }
        while (i8 <= i7) {
            int i9 = (i8 + i7) / 2;
            int iCompareTo2 = comparable.compareTo(((h8) this.s[i9]).s);
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
        if (this.f11805w == null) {
            this.f11805w = new j8(this);
        }
        return this.f11805w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return super.equals(obj);
        }
        k8 k8Var = (k8) obj;
        int size = size();
        if (size == k8Var.size()) {
            int i6 = this.f11802t;
            if (i6 != k8Var.f11802t) {
                return entrySet().equals(k8Var.entrySet());
            }
            for (int i7 = 0; i7 < i6; i7++) {
                if (d(i7).equals(k8Var.d(i7))) {
                }
            }
            if (i6 != size) {
                return this.f11803u.equals(k8Var.f11803u);
            }
            return true;
        }
        return false;
    }

    public final Object f(int i6) {
        h();
        Object[] objArr = this.s;
        Object obj = ((h8) objArr[i6]).f11769t;
        System.arraycopy(objArr, i6 + 1, objArr, i6, (this.f11802t - i6) - 1);
        this.f11802t--;
        if (!this.f11803u.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.s;
            int i7 = this.f11802t;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i7] = new h8(this, (Comparable) entry.getKey(), entry.getValue());
            this.f11802t++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f11803u.isEmpty() && !(this.f11803u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11803u = treeMap;
            this.f11806x = treeMap.descendingMap();
        }
        return (SortedMap) this.f11803u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((h8) this.s[iE]).f11769t : this.f11803u.get(comparable);
    }

    public final void h() {
        if (this.f11804v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i6 = this.f11802t;
        int iHashCode = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode += this.s[i7].hashCode();
        }
        return this.f11803u.size() > 0 ? this.f11803u.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return f(iE);
        }
        if (this.f11803u.isEmpty()) {
            return null;
        }
        return this.f11803u.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11803u.size() + this.f11802t;
    }
}
