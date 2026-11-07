package b6;

import android.view.View;
import androidx.room.i0;
import androidx.room.p0;
import c0.g0;
import com.basitce.htmltoapk.R;
import java.util.ListIterator;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.h0;
import mh.t;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import rg.b;

/* loaded from: classes.dex */
public final class c {
    public static final String a(String serialName, ci.d dVar) {
        kotlin.jvm.internal.r.e(serialName, "serialName");
        return "Cannot deserialize " + serialName + " with '" + h0.a(dVar.getClass()).e() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final void b(h6.b connection) {
        kotlin.jvm.internal.r.e(connection, "connection");
        rg.b bVarB = g0.b();
        h6.d dVarB0 = connection.B0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (dVarB0.t0()) {
            try {
                bVarB.add(dVarB0.W(0));
            } finally {
            }
        }
        f0 f0Var = f0.f21461a;
        ch.a.a(dVarB0, null);
        ListIterator listIterator = g0.a(bVarB).listIterator(0);
        while (true) {
            b.C0262b c0262b = (b.C0262b) listIterator;
            if (!c0262b.hasNext()) {
                return;
            }
            String str = (String) c0262b.next();
            if (t.p(str, "room_fts_content_sync_", false)) {
                h6.a.a("DROP TRIGGER IF EXISTS ".concat(str), connection);
            }
        }
    }

    public static final String c(ci.e eVar, String serialName) {
        kotlin.jvm.internal.r.e(serialName, "serialName");
        return "Cannot serialize " + serialName + " with '" + h0.a(eVar.getClass()).e() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }

    public static final c6.e d(View view) {
        kotlin.jvm.internal.r.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            c6.e eVar = tag instanceof c6.e ? (c6.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object objA = b4.a.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final tg.h e(androidx.room.g0 g0Var, boolean z10, vg.c cVar) {
        if (!g0Var.inCompatibilityMode$room_runtime_release()) {
            return g0Var.getCoroutineScope().getCoroutineContext();
        }
        p0 p0Var = (p0) cVar.getContext().get(p0.f3043c);
        if (p0Var != null) {
            tg.h hVarPlus = g0Var.getQueryContext().plus(p0Var.f3044a);
            if (hVarPlus != null) {
                return hVarPlus;
            }
        }
        return z10 ? g0Var.getTransactionContext$room_runtime_release() : g0Var.getQueryContext();
    }

    public static final Object f(androidx.room.g0 g0Var, eh.l lVar, tg.e eVar) throws Throwable {
        if (!g0Var.inCompatibilityMode$room_runtime_release()) {
            return ph.h.e(g0Var.getCoroutineScope().getCoroutineContext(), new f(g0Var, lVar, null), eVar);
        }
        i0 i0Var = new i0(new e(g0Var, lVar, null), null);
        p0 p0Var = (p0) eVar.getContext().get(p0.f3043c);
        tg.f fVar = p0Var != null ? p0Var.f3044a : null;
        if (fVar != null) {
            return ph.h.e(fVar, i0Var, eVar);
        }
        tg.h context = eVar.getContext();
        ph.m mVar = new ph.m(1, ah.p.c(eVar));
        mVar.p();
        try {
            g0Var.getTransactionExecutor().execute(new androidx.room.h0(context, mVar, g0Var, i0Var));
        } catch (RejectedExecutionException e10) {
            mVar.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objO = mVar.o();
        ug.a aVar = ug.a.f29706a;
        return objO;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(androidx.room.g0 g0Var, eh.l lVar, tg.e eVar, boolean z10, boolean z11) throws Throwable {
        h hVar;
        androidx.room.g0 g0Var2;
        eh.l lVar2;
        boolean z12;
        boolean z13;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i10 = hVar.f3619f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f3619f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        }
        h hVar2 = hVar;
        Object obj = hVar2.f3618e;
        ug.a aVar = ug.a.f29706a;
        int i11 = hVar2.f3619f;
        if (i11 == 0) {
            pg.q.b(obj);
            if (g0Var.inCompatibilityMode$room_runtime_release() && g0Var.isOpenInternal() && g0Var.inTransaction()) {
                i iVar = new i(g0Var, lVar, null, z11, z10);
                hVar2.f3619f = 1;
                Object objUseConnection$room_runtime_release = g0Var.useConnection$room_runtime_release(z10, iVar, hVar2);
                if (objUseConnection$room_runtime_release != aVar) {
                    return objUseConnection$room_runtime_release;
                }
            } else {
                hVar2.f3614a = g0Var;
                hVar2.f3615b = lVar;
                hVar2.f3616c = z10;
                hVar2.f3617d = z11;
                hVar2.f3619f = 2;
                tg.h hVarE = e(g0Var, z11, hVar2);
                if (hVarE != aVar) {
                    g0Var2 = g0Var;
                    lVar2 = lVar;
                    obj = hVarE;
                    z12 = z11;
                    z13 = z10;
                }
            }
        }
        if (i11 == 1) {
            pg.q.b(obj);
            return obj;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        boolean z14 = hVar2.f3617d;
        boolean z15 = hVar2.f3616c;
        eh.l lVar3 = hVar2.f3615b;
        androidx.room.g0 g0Var3 = hVar2.f3614a;
        pg.q.b(obj);
        z12 = z14;
        z13 = z15;
        lVar2 = lVar3;
        g0Var2 = g0Var3;
        g gVar = new g(g0Var2, lVar2, null, z13, z12);
        hVar2.f3614a = null;
        hVar2.f3615b = null;
        hVar2.f3619f = 3;
        Object objE = ph.h.e((tg.h) obj, gVar, hVar2);
        return objE == aVar ? aVar : objE;
    }
}
