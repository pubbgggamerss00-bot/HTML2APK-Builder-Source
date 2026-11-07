package jg;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b.k;
import kotlin.jvm.internal.h0;

/* loaded from: classes2.dex */
public final class c implements mg.b<fg.a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f15725a;

    /* renamed from: b, reason: collision with root package name */
    public final k f15726b;

    /* renamed from: c, reason: collision with root package name */
    public volatile fg.a f15727c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15728d = new Object();

    public interface a {
        f8.c a();
    }

    public static final class b extends w0 {

        /* renamed from: b, reason: collision with root package name */
        public final f8.d f15729b;

        /* renamed from: c, reason: collision with root package name */
        public final e f15730c;

        public b(f8.d dVar, e eVar) {
            this.f15729b = dVar;
            this.f15730c = eVar;
        }

        @Override // androidx.lifecycle.w0
        public final void e() {
            ((ig.e) ((InterfaceC0152c) b3.a.c(InterfaceC0152c.class, this.f15729b)).a()).a();
        }
    }

    /* renamed from: jg.c$c, reason: collision with other inner class name */
    public interface InterfaceC0152c {
        eg.a a();
    }

    public c(k kVar) {
        this.f15725a = kVar;
        this.f15726b = kVar;
    }

    public static z0 a(k kVar, k kVar2) {
        return new z0(kVar.getViewModelStore(), new jg.b(kVar2), kVar.getDefaultViewModelCreationExtras());
    }

    @Override // mg.b
    public final fg.a generatedComponent() {
        if (this.f15727c == null) {
            synchronized (this.f15728d) {
                try {
                    if (this.f15727c == null) {
                        this.f15727c = ((b) a(this.f15725a, this.f15726b).a(h0.a(b.class))).f15729b;
                    }
                } finally {
                }
            }
        }
        return this.f15727c;
    }
}
