package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Account f2414a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<Scope> f2415b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<Scope> f2416c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2417d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2418e;

    /* renamed from: f, reason: collision with root package name */
    public final t3.a f2419f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f2420g;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Account f2421a;

        /* renamed from: b, reason: collision with root package name */
        public w.b<Scope> f2422b;

        /* renamed from: c, reason: collision with root package name */
        public String f2423c;

        /* renamed from: d, reason: collision with root package name */
        public String f2424d;
    }

    public c(Account account, Set set, String str, String str2) {
        this.f2414a = account;
        Set<Scope> setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f2415b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f2417d = str;
        this.f2418e = str2;
        this.f2419f = t3.a.f14431b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((r) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.f2416c = Collections.unmodifiableSet(hashSet);
    }
}
