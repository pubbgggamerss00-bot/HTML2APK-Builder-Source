package com.google.android.gms.common.internal;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Account f6090a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f6091b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f6092c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6093d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6094e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6095f;

    /* renamed from: g, reason: collision with root package name */
    public final jb.a f6096g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f6097h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Account f6098a;

        /* renamed from: b, reason: collision with root package name */
        public p.b f6099b;

        /* renamed from: c, reason: collision with root package name */
        public String f6100c;

        /* renamed from: d, reason: collision with root package name */
        public String f6101d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    public d(Account account, Set set, p.a aVar, String str, String str2, jb.a aVar2) {
        this.f6090a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f6091b = setUnmodifiableSet;
        p.a aVar3 = aVar == null ? Collections.EMPTY_MAP : aVar;
        this.f6093d = aVar3;
        this.f6094e = str;
        this.f6095f = str2;
        this.f6096g = aVar2 == null ? jb.a.f15675a : aVar2;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = aVar3.values().iterator();
        while (it.hasNext()) {
            ((x) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.f6092c = Collections.unmodifiableSet(hashSet);
    }
}
