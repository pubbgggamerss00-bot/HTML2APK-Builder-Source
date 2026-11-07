package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.m0;
import androidx.work.b;
import androidx.work.impl.WorkDatabase_Impl;
import b6.b;
import c7.a0;
import c7.b0;
import c7.c0;
import c7.d0;
import c7.e0;
import c7.f0;
import c7.g0;
import c7.h0;
import c7.q;
import c7.r;
import c7.s;
import c7.t;
import c7.u;
import c7.v;
import c7.w;
import c7.x;
import c7.y;
import c7.z;
import d7.o;
import eh.l;
import i6.f;
import java.util.ArrayList;
import kotlinx.serialization.internal.o0;
import org.bouncycastle.asn1.x509.DisplayText;
import t6.e;

/* loaded from: classes.dex */
public final class a implements WorkSpecDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3193a;

    /* renamed from: b, reason: collision with root package name */
    public final y f3194b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f3195c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f3196d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f3197e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f3198f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f3199g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f3200h;

    /* renamed from: i, reason: collision with root package name */
    public final h0 f3201i;

    /* renamed from: j, reason: collision with root package name */
    public final q f3202j;

    /* renamed from: k, reason: collision with root package name */
    public final s f3203k;

    /* renamed from: l, reason: collision with root package name */
    public final t f3204l;

    /* renamed from: m, reason: collision with root package name */
    public final u f3205m;

    /* renamed from: n, reason: collision with root package name */
    public final x f3206n;

    public a(WorkDatabase_Impl workDatabase_Impl) {
        this.f3193a = workDatabase_Impl;
        this.f3194b = new y(workDatabase_Impl);
        new a0(workDatabase_Impl);
        this.f3195c = new b0(workDatabase_Impl);
        this.f3196d = new c0(workDatabase_Impl);
        this.f3197e = new d0(workDatabase_Impl);
        this.f3198f = new e0(workDatabase_Impl);
        this.f3199g = new f0(workDatabase_Impl);
        this.f3200h = new g0(workDatabase_Impl);
        this.f3201i = new h0(workDatabase_Impl);
        this.f3202j = new q(workDatabase_Impl);
        new r(workDatabase_Impl);
        this.f3203k = new s(workDatabase_Impl);
        this.f3204l = new t(workDatabase_Impl);
        this.f3205m = new u(workDatabase_Impl);
        new v(workDatabase_Impl);
        new w(workDatabase_Impl);
        this.f3206n = new x(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        b0 b0Var = this.f3195c;
        f fVarA = b0Var.a();
        fVarA.o(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            b0Var.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList b() {
        m0.p(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)").o(1, null);
        throw null;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList c() throws Throwable {
        m0 m0Var;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        int iA10;
        int iA11;
        int iA12;
        int iA13;
        m0 m0VarP = m0.p(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        m0VarP.d(1, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            iA = b.a(cursorQuery, "id");
            iA2 = b.a(cursorQuery, "state");
            iA3 = b.a(cursorQuery, "worker_class_name");
            iA4 = b.a(cursorQuery, "input_merger_class_name");
            iA5 = b.a(cursorQuery, "input");
            iA6 = b.a(cursorQuery, "output");
            iA7 = b.a(cursorQuery, "initial_delay");
            iA8 = b.a(cursorQuery, "interval_duration");
            iA9 = b.a(cursorQuery, "flex_duration");
            iA10 = b.a(cursorQuery, "run_attempt_count");
            iA11 = b.a(cursorQuery, "backoff_policy");
            iA12 = b.a(cursorQuery, "backoff_delay_duration");
            iA13 = b.a(cursorQuery, "last_enqueue_time");
            m0Var = m0VarP;
        } catch (Throwable th2) {
            th = th2;
            m0Var = m0VarP;
        }
        try {
            int iA14 = b.a(cursorQuery, "minimum_retention_duration");
            int iA15 = b.a(cursorQuery, "schedule_requested_at");
            int iA16 = b.a(cursorQuery, "run_in_foreground");
            int iA17 = b.a(cursorQuery, "out_of_quota_policy");
            int iA18 = b.a(cursorQuery, "period_count");
            int iA19 = b.a(cursorQuery, "generation");
            int iA20 = b.a(cursorQuery, "next_schedule_time_override");
            int iA21 = b.a(cursorQuery, "next_schedule_time_override_generation");
            int iA22 = b.a(cursorQuery, "stop_reason");
            int iA23 = b.a(cursorQuery, "trace_tag");
            int iA24 = b.a(cursorQuery, "required_network_type");
            int iA25 = b.a(cursorQuery, "required_network_request");
            int iA26 = b.a(cursorQuery, "requires_charging");
            int iA27 = b.a(cursorQuery, "requires_device_idle");
            int iA28 = b.a(cursorQuery, "requires_battery_not_low");
            int iA29 = b.a(cursorQuery, "requires_storage_not_low");
            int iA30 = b.a(cursorQuery, "trigger_content_update_delay");
            int iA31 = b.a(cursorQuery, "trigger_max_content_delay");
            int iA32 = b.a(cursorQuery, "content_uri_triggers");
            int i10 = iA14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(iA);
                t6.c0 c0VarE = c7.m0.e(cursorQuery.getInt(iA2));
                String string2 = cursorQuery.getString(iA3);
                String string3 = cursorQuery.getString(iA4);
                androidx.work.b bVarA = androidx.work.b.a(cursorQuery.getBlob(iA5));
                androidx.work.b bVarA2 = androidx.work.b.a(cursorQuery.getBlob(iA6));
                long j10 = cursorQuery.getLong(iA7);
                long j11 = cursorQuery.getLong(iA8);
                long j12 = cursorQuery.getLong(iA9);
                int i11 = cursorQuery.getInt(iA10);
                t6.a aVarB = c7.m0.b(cursorQuery.getInt(iA11));
                long j13 = cursorQuery.getLong(iA12);
                long j14 = cursorQuery.getLong(iA13);
                int i12 = i10;
                long j15 = cursorQuery.getLong(i12);
                int i13 = iA12;
                int i14 = iA15;
                long j16 = cursorQuery.getLong(i14);
                iA15 = i14;
                int i15 = iA16;
                boolean z10 = cursorQuery.getInt(i15) != 0;
                iA16 = i15;
                int i16 = iA17;
                t6.b0 b0VarD = c7.m0.d(cursorQuery.getInt(i16));
                iA17 = i16;
                int i17 = iA18;
                int i18 = cursorQuery.getInt(i17);
                iA18 = i17;
                int i19 = iA19;
                int i20 = cursorQuery.getInt(i19);
                iA19 = i19;
                int i21 = iA20;
                long j17 = cursorQuery.getLong(i21);
                iA20 = i21;
                int i22 = iA21;
                int i23 = cursorQuery.getInt(i22);
                iA21 = i22;
                int i24 = iA22;
                int i25 = cursorQuery.getInt(i24);
                iA22 = i24;
                int i26 = iA23;
                String string4 = cursorQuery.isNull(i26) ? null : cursorQuery.getString(i26);
                iA23 = i26;
                int i27 = iA24;
                t6.t tVarC = c7.m0.c(cursorQuery.getInt(i27));
                iA24 = i27;
                int i28 = iA25;
                o oVarG = c7.m0.g(cursorQuery.getBlob(i28));
                iA25 = i28;
                int i29 = iA26;
                boolean z11 = cursorQuery.getInt(i29) != 0;
                iA26 = i29;
                int i30 = iA27;
                boolean z12 = cursorQuery.getInt(i30) != 0;
                iA27 = i30;
                int i31 = iA28;
                boolean z13 = cursorQuery.getInt(i31) != 0;
                iA28 = i31;
                int i32 = iA29;
                boolean z14 = cursorQuery.getInt(i32) != 0;
                iA29 = i32;
                int i33 = iA30;
                long j18 = cursorQuery.getLong(i33);
                iA30 = i33;
                int i34 = iA31;
                long j19 = cursorQuery.getLong(i34);
                iA31 = i34;
                int i35 = iA32;
                iA32 = i35;
                arrayList.add(new WorkSpec(string, c0VarE, string2, string3, bVarA, bVarA2, j10, j11, j12, new e(oVarG, tVarC, z11, z12, z13, z14, j18, j19, c7.m0.a(cursorQuery.getBlob(i35))), i11, aVarB, j13, j14, j15, j16, z10, b0VarD, i18, i20, j17, i23, i25, string4));
                iA12 = i13;
                i10 = i12;
            }
            cursorQuery.close();
            m0Var.z();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery.close();
            m0Var.z();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void d(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        e0 e0Var = this.f3198f;
        f fVarA = e0Var.a();
        fVarA.o(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            e0Var.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int e(String str, long j10) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        t tVar = this.f3204l;
        f fVarA = tVar.a();
        fVarA.d(1, j10);
        fVarA.o(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iQ = fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
                return iQ;
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            tVar.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final x5.f f() {
        final z zVar = new z(this, m0.p(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"));
        l lVar = new l() { // from class: androidx.room.b
            @Override // eh.l
            public final Object invoke(Object obj) {
                h6.b it = (h6.b) obj;
                kotlin.jvm.internal.r.e(it, "it");
                return zVar.call();
            }
        };
        return o0.a(this.f3193a, new String[]{"workspec"}, lVar);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList g(long j10) throws Throwable {
        m0 m0Var;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        int iA10;
        int iA11;
        int iA12;
        int iA13;
        m0 m0VarP = m0.p(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        m0VarP.d(1, j10);
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            iA = b.a(cursorQuery, "id");
            iA2 = b.a(cursorQuery, "state");
            iA3 = b.a(cursorQuery, "worker_class_name");
            iA4 = b.a(cursorQuery, "input_merger_class_name");
            iA5 = b.a(cursorQuery, "input");
            iA6 = b.a(cursorQuery, "output");
            iA7 = b.a(cursorQuery, "initial_delay");
            iA8 = b.a(cursorQuery, "interval_duration");
            iA9 = b.a(cursorQuery, "flex_duration");
            iA10 = b.a(cursorQuery, "run_attempt_count");
            iA11 = b.a(cursorQuery, "backoff_policy");
            iA12 = b.a(cursorQuery, "backoff_delay_duration");
            iA13 = b.a(cursorQuery, "last_enqueue_time");
            m0Var = m0VarP;
        } catch (Throwable th2) {
            th = th2;
            m0Var = m0VarP;
        }
        try {
            int iA14 = b.a(cursorQuery, "minimum_retention_duration");
            int iA15 = b.a(cursorQuery, "schedule_requested_at");
            int iA16 = b.a(cursorQuery, "run_in_foreground");
            int iA17 = b.a(cursorQuery, "out_of_quota_policy");
            int iA18 = b.a(cursorQuery, "period_count");
            int iA19 = b.a(cursorQuery, "generation");
            int iA20 = b.a(cursorQuery, "next_schedule_time_override");
            int iA21 = b.a(cursorQuery, "next_schedule_time_override_generation");
            int iA22 = b.a(cursorQuery, "stop_reason");
            int iA23 = b.a(cursorQuery, "trace_tag");
            int iA24 = b.a(cursorQuery, "required_network_type");
            int iA25 = b.a(cursorQuery, "required_network_request");
            int iA26 = b.a(cursorQuery, "requires_charging");
            int iA27 = b.a(cursorQuery, "requires_device_idle");
            int iA28 = b.a(cursorQuery, "requires_battery_not_low");
            int iA29 = b.a(cursorQuery, "requires_storage_not_low");
            int iA30 = b.a(cursorQuery, "trigger_content_update_delay");
            int iA31 = b.a(cursorQuery, "trigger_max_content_delay");
            int iA32 = b.a(cursorQuery, "content_uri_triggers");
            int i10 = iA14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(iA);
                t6.c0 c0VarE = c7.m0.e(cursorQuery.getInt(iA2));
                String string2 = cursorQuery.getString(iA3);
                String string3 = cursorQuery.getString(iA4);
                androidx.work.b bVarA = androidx.work.b.a(cursorQuery.getBlob(iA5));
                androidx.work.b bVarA2 = androidx.work.b.a(cursorQuery.getBlob(iA6));
                long j11 = cursorQuery.getLong(iA7);
                long j12 = cursorQuery.getLong(iA8);
                long j13 = cursorQuery.getLong(iA9);
                int i11 = cursorQuery.getInt(iA10);
                t6.a aVarB = c7.m0.b(cursorQuery.getInt(iA11));
                long j14 = cursorQuery.getLong(iA12);
                long j15 = cursorQuery.getLong(iA13);
                int i12 = i10;
                long j16 = cursorQuery.getLong(i12);
                int i13 = iA12;
                int i14 = iA15;
                long j17 = cursorQuery.getLong(i14);
                iA15 = i14;
                int i15 = iA16;
                boolean z10 = cursorQuery.getInt(i15) != 0;
                iA16 = i15;
                int i16 = iA17;
                t6.b0 b0VarD = c7.m0.d(cursorQuery.getInt(i16));
                iA17 = i16;
                int i17 = iA18;
                int i18 = cursorQuery.getInt(i17);
                iA18 = i17;
                int i19 = iA19;
                int i20 = cursorQuery.getInt(i19);
                iA19 = i19;
                int i21 = iA20;
                long j18 = cursorQuery.getLong(i21);
                iA20 = i21;
                int i22 = iA21;
                int i23 = cursorQuery.getInt(i22);
                iA21 = i22;
                int i24 = iA22;
                int i25 = cursorQuery.getInt(i24);
                iA22 = i24;
                int i26 = iA23;
                String string4 = cursorQuery.isNull(i26) ? null : cursorQuery.getString(i26);
                iA23 = i26;
                int i27 = iA24;
                t6.t tVarC = c7.m0.c(cursorQuery.getInt(i27));
                iA24 = i27;
                int i28 = iA25;
                o oVarG = c7.m0.g(cursorQuery.getBlob(i28));
                iA25 = i28;
                int i29 = iA26;
                boolean z11 = cursorQuery.getInt(i29) != 0;
                iA26 = i29;
                int i30 = iA27;
                boolean z12 = cursorQuery.getInt(i30) != 0;
                iA27 = i30;
                int i31 = iA28;
                boolean z13 = cursorQuery.getInt(i31) != 0;
                iA28 = i31;
                int i32 = iA29;
                boolean z14 = cursorQuery.getInt(i32) != 0;
                iA29 = i32;
                int i33 = iA30;
                long j19 = cursorQuery.getLong(i33);
                iA30 = i33;
                int i34 = iA31;
                long j20 = cursorQuery.getLong(i34);
                iA31 = i34;
                int i35 = iA32;
                iA32 = i35;
                arrayList.add(new WorkSpec(string, c0VarE, string2, string3, bVarA, bVarA2, j11, j12, j13, new e(oVarG, tVarC, z11, z12, z13, z14, j19, j20, c7.m0.a(cursorQuery.getBlob(i35))), i11, aVarB, j14, j15, j16, j17, z10, b0VarD, i18, i20, j18, i23, i25, string4));
                iA12 = i13;
                i10 = i12;
            }
            cursorQuery.close();
            m0Var.z();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery.close();
            m0Var.z();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList h(int i10) throws Throwable {
        m0 m0Var;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        int iA10;
        int iA11;
        int iA12;
        int iA13;
        m0 m0VarP = m0.p(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        m0VarP.d(1, i10);
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            iA = b.a(cursorQuery, "id");
            iA2 = b.a(cursorQuery, "state");
            iA3 = b.a(cursorQuery, "worker_class_name");
            iA4 = b.a(cursorQuery, "input_merger_class_name");
            iA5 = b.a(cursorQuery, "input");
            iA6 = b.a(cursorQuery, "output");
            iA7 = b.a(cursorQuery, "initial_delay");
            iA8 = b.a(cursorQuery, "interval_duration");
            iA9 = b.a(cursorQuery, "flex_duration");
            iA10 = b.a(cursorQuery, "run_attempt_count");
            iA11 = b.a(cursorQuery, "backoff_policy");
            iA12 = b.a(cursorQuery, "backoff_delay_duration");
            iA13 = b.a(cursorQuery, "last_enqueue_time");
            m0Var = m0VarP;
        } catch (Throwable th2) {
            th = th2;
            m0Var = m0VarP;
        }
        try {
            int iA14 = b.a(cursorQuery, "minimum_retention_duration");
            int iA15 = b.a(cursorQuery, "schedule_requested_at");
            int iA16 = b.a(cursorQuery, "run_in_foreground");
            int iA17 = b.a(cursorQuery, "out_of_quota_policy");
            int iA18 = b.a(cursorQuery, "period_count");
            int iA19 = b.a(cursorQuery, "generation");
            int iA20 = b.a(cursorQuery, "next_schedule_time_override");
            int iA21 = b.a(cursorQuery, "next_schedule_time_override_generation");
            int iA22 = b.a(cursorQuery, "stop_reason");
            int iA23 = b.a(cursorQuery, "trace_tag");
            int iA24 = b.a(cursorQuery, "required_network_type");
            int iA25 = b.a(cursorQuery, "required_network_request");
            int iA26 = b.a(cursorQuery, "requires_charging");
            int iA27 = b.a(cursorQuery, "requires_device_idle");
            int iA28 = b.a(cursorQuery, "requires_battery_not_low");
            int iA29 = b.a(cursorQuery, "requires_storage_not_low");
            int iA30 = b.a(cursorQuery, "trigger_content_update_delay");
            int iA31 = b.a(cursorQuery, "trigger_max_content_delay");
            int iA32 = b.a(cursorQuery, "content_uri_triggers");
            int i11 = iA14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(iA);
                t6.c0 c0VarE = c7.m0.e(cursorQuery.getInt(iA2));
                String string2 = cursorQuery.getString(iA3);
                String string3 = cursorQuery.getString(iA4);
                androidx.work.b bVarA = androidx.work.b.a(cursorQuery.getBlob(iA5));
                androidx.work.b bVarA2 = androidx.work.b.a(cursorQuery.getBlob(iA6));
                long j10 = cursorQuery.getLong(iA7);
                long j11 = cursorQuery.getLong(iA8);
                long j12 = cursorQuery.getLong(iA9);
                int i12 = cursorQuery.getInt(iA10);
                t6.a aVarB = c7.m0.b(cursorQuery.getInt(iA11));
                long j13 = cursorQuery.getLong(iA12);
                long j14 = cursorQuery.getLong(iA13);
                int i13 = i11;
                long j15 = cursorQuery.getLong(i13);
                int i14 = iA12;
                int i15 = iA15;
                long j16 = cursorQuery.getLong(i15);
                iA15 = i15;
                int i16 = iA16;
                boolean z10 = cursorQuery.getInt(i16) != 0;
                iA16 = i16;
                int i17 = iA17;
                t6.b0 b0VarD = c7.m0.d(cursorQuery.getInt(i17));
                iA17 = i17;
                int i18 = iA18;
                int i19 = cursorQuery.getInt(i18);
                iA18 = i18;
                int i20 = iA19;
                int i21 = cursorQuery.getInt(i20);
                iA19 = i20;
                int i22 = iA20;
                long j17 = cursorQuery.getLong(i22);
                iA20 = i22;
                int i23 = iA21;
                int i24 = cursorQuery.getInt(i23);
                iA21 = i23;
                int i25 = iA22;
                int i26 = cursorQuery.getInt(i25);
                iA22 = i25;
                int i27 = iA23;
                String string4 = cursorQuery.isNull(i27) ? null : cursorQuery.getString(i27);
                iA23 = i27;
                int i28 = iA24;
                t6.t tVarC = c7.m0.c(cursorQuery.getInt(i28));
                iA24 = i28;
                int i29 = iA25;
                o oVarG = c7.m0.g(cursorQuery.getBlob(i29));
                iA25 = i29;
                int i30 = iA26;
                boolean z11 = cursorQuery.getInt(i30) != 0;
                iA26 = i30;
                int i31 = iA27;
                boolean z12 = cursorQuery.getInt(i31) != 0;
                iA27 = i31;
                int i32 = iA28;
                boolean z13 = cursorQuery.getInt(i32) != 0;
                iA28 = i32;
                int i33 = iA29;
                boolean z14 = cursorQuery.getInt(i33) != 0;
                iA29 = i33;
                int i34 = iA30;
                long j18 = cursorQuery.getLong(i34);
                iA30 = i34;
                int i35 = iA31;
                long j19 = cursorQuery.getLong(i35);
                iA31 = i35;
                int i36 = iA32;
                iA32 = i36;
                arrayList.add(new WorkSpec(string, c0VarE, string2, string3, bVarA, bVarA2, j10, j11, j12, new e(oVarG, tVarC, z11, z12, z13, z14, j18, j19, c7.m0.a(cursorQuery.getBlob(i36))), i12, aVarB, j13, j14, j15, j16, z10, b0VarD, i19, i21, j17, i24, i26, string4));
                iA12 = i14;
                i11 = i13;
            }
            cursorQuery.close();
            m0Var.z();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery.close();
            m0Var.z();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList i() {
        m0.p(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)").o(1, null);
        throw null;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void j(WorkSpec workSpec) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f3194b.e(workSpec);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void k(int i10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        s sVar = this.f3203k;
        f fVarA = sVar.a();
        fVarA.o(1, str);
        fVarA.d(2, i10);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            sVar.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList l() throws Throwable {
        m0 m0Var;
        m0 m0VarP = m0.p(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            int iA = b.a(cursorQuery, "id");
            int iA2 = b.a(cursorQuery, "state");
            int iA3 = b.a(cursorQuery, "worker_class_name");
            int iA4 = b.a(cursorQuery, "input_merger_class_name");
            int iA5 = b.a(cursorQuery, "input");
            int iA6 = b.a(cursorQuery, "output");
            int iA7 = b.a(cursorQuery, "initial_delay");
            int iA8 = b.a(cursorQuery, "interval_duration");
            int iA9 = b.a(cursorQuery, "flex_duration");
            int iA10 = b.a(cursorQuery, "run_attempt_count");
            int iA11 = b.a(cursorQuery, "backoff_policy");
            int iA12 = b.a(cursorQuery, "backoff_delay_duration");
            int iA13 = b.a(cursorQuery, "last_enqueue_time");
            m0Var = m0VarP;
            try {
                int iA14 = b.a(cursorQuery, "minimum_retention_duration");
                int iA15 = b.a(cursorQuery, "schedule_requested_at");
                int iA16 = b.a(cursorQuery, "run_in_foreground");
                int iA17 = b.a(cursorQuery, "out_of_quota_policy");
                int iA18 = b.a(cursorQuery, "period_count");
                int iA19 = b.a(cursorQuery, "generation");
                int iA20 = b.a(cursorQuery, "next_schedule_time_override");
                int iA21 = b.a(cursorQuery, "next_schedule_time_override_generation");
                int iA22 = b.a(cursorQuery, "stop_reason");
                int iA23 = b.a(cursorQuery, "trace_tag");
                int iA24 = b.a(cursorQuery, "required_network_type");
                int iA25 = b.a(cursorQuery, "required_network_request");
                int iA26 = b.a(cursorQuery, "requires_charging");
                int iA27 = b.a(cursorQuery, "requires_device_idle");
                int iA28 = b.a(cursorQuery, "requires_battery_not_low");
                int iA29 = b.a(cursorQuery, "requires_storage_not_low");
                int iA30 = b.a(cursorQuery, "trigger_content_update_delay");
                int iA31 = b.a(cursorQuery, "trigger_max_content_delay");
                int iA32 = b.a(cursorQuery, "content_uri_triggers");
                int i10 = iA14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(iA);
                    t6.c0 c0VarE = c7.m0.e(cursorQuery.getInt(iA2));
                    String string2 = cursorQuery.getString(iA3);
                    String string3 = cursorQuery.getString(iA4);
                    androidx.work.b bVarA = androidx.work.b.a(cursorQuery.getBlob(iA5));
                    androidx.work.b bVarA2 = androidx.work.b.a(cursorQuery.getBlob(iA6));
                    long j10 = cursorQuery.getLong(iA7);
                    long j11 = cursorQuery.getLong(iA8);
                    long j12 = cursorQuery.getLong(iA9);
                    int i11 = cursorQuery.getInt(iA10);
                    t6.a aVarB = c7.m0.b(cursorQuery.getInt(iA11));
                    long j13 = cursorQuery.getLong(iA12);
                    long j14 = cursorQuery.getLong(iA13);
                    int i12 = i10;
                    long j15 = cursorQuery.getLong(i12);
                    int i13 = iA12;
                    int i14 = iA15;
                    long j16 = cursorQuery.getLong(i14);
                    iA15 = i14;
                    int i15 = iA16;
                    boolean z10 = cursorQuery.getInt(i15) != 0;
                    iA16 = i15;
                    int i16 = iA17;
                    t6.b0 b0VarD = c7.m0.d(cursorQuery.getInt(i16));
                    iA17 = i16;
                    int i17 = iA18;
                    int i18 = cursorQuery.getInt(i17);
                    iA18 = i17;
                    int i19 = iA19;
                    int i20 = cursorQuery.getInt(i19);
                    iA19 = i19;
                    int i21 = iA20;
                    long j17 = cursorQuery.getLong(i21);
                    iA20 = i21;
                    int i22 = iA21;
                    int i23 = cursorQuery.getInt(i22);
                    iA21 = i22;
                    int i24 = iA22;
                    int i25 = cursorQuery.getInt(i24);
                    iA22 = i24;
                    int i26 = iA23;
                    String string4 = cursorQuery.isNull(i26) ? null : cursorQuery.getString(i26);
                    iA23 = i26;
                    int i27 = iA24;
                    t6.t tVarC = c7.m0.c(cursorQuery.getInt(i27));
                    iA24 = i27;
                    int i28 = iA25;
                    o oVarG = c7.m0.g(cursorQuery.getBlob(i28));
                    iA25 = i28;
                    int i29 = iA26;
                    boolean z11 = cursorQuery.getInt(i29) != 0;
                    iA26 = i29;
                    int i30 = iA27;
                    boolean z12 = cursorQuery.getInt(i30) != 0;
                    iA27 = i30;
                    int i31 = iA28;
                    boolean z13 = cursorQuery.getInt(i31) != 0;
                    iA28 = i31;
                    int i32 = iA29;
                    boolean z14 = cursorQuery.getInt(i32) != 0;
                    iA29 = i32;
                    int i33 = iA30;
                    long j18 = cursorQuery.getLong(i33);
                    iA30 = i33;
                    int i34 = iA31;
                    long j19 = cursorQuery.getLong(i34);
                    iA31 = i34;
                    int i35 = iA32;
                    iA32 = i35;
                    arrayList.add(new WorkSpec(string, c0VarE, string2, string3, bVarA, bVarA2, j10, j11, j12, new e(oVarG, tVarC, z11, z12, z13, z14, j18, j19, c7.m0.a(cursorQuery.getBlob(i35))), i11, aVarB, j13, j14, j15, j16, z10, b0VarD, i18, i20, j17, i23, i25, string4));
                    iA12 = i13;
                    i10 = i12;
                }
                cursorQuery.close();
                m0Var.z();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                m0Var.z();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            m0Var = m0VarP;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void m(String str, androidx.work.b bVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        f0 f0Var = this.f3199g;
        f fVarA = f0Var.a();
        androidx.work.b bVar2 = androidx.work.b.f3129b;
        fVarA.L(1, b.C0046b.b(bVar));
        fVarA.o(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            f0Var.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void n(String str, long j10) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        g0 g0Var = this.f3200h;
        f fVarA = g0Var.a();
        fVarA.d(1, j10);
        fVarA.o(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            g0Var.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList o() throws Throwable {
        m0 m0Var;
        m0 m0VarP = m0.p(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            int iA = b6.b.a(cursorQuery, "id");
            int iA2 = b6.b.a(cursorQuery, "state");
            int iA3 = b6.b.a(cursorQuery, "worker_class_name");
            int iA4 = b6.b.a(cursorQuery, "input_merger_class_name");
            int iA5 = b6.b.a(cursorQuery, "input");
            int iA6 = b6.b.a(cursorQuery, "output");
            int iA7 = b6.b.a(cursorQuery, "initial_delay");
            int iA8 = b6.b.a(cursorQuery, "interval_duration");
            int iA9 = b6.b.a(cursorQuery, "flex_duration");
            int iA10 = b6.b.a(cursorQuery, "run_attempt_count");
            int iA11 = b6.b.a(cursorQuery, "backoff_policy");
            int iA12 = b6.b.a(cursorQuery, "backoff_delay_duration");
            int iA13 = b6.b.a(cursorQuery, "last_enqueue_time");
            m0Var = m0VarP;
            try {
                int iA14 = b6.b.a(cursorQuery, "minimum_retention_duration");
                int iA15 = b6.b.a(cursorQuery, "schedule_requested_at");
                int iA16 = b6.b.a(cursorQuery, "run_in_foreground");
                int iA17 = b6.b.a(cursorQuery, "out_of_quota_policy");
                int iA18 = b6.b.a(cursorQuery, "period_count");
                int iA19 = b6.b.a(cursorQuery, "generation");
                int iA20 = b6.b.a(cursorQuery, "next_schedule_time_override");
                int iA21 = b6.b.a(cursorQuery, "next_schedule_time_override_generation");
                int iA22 = b6.b.a(cursorQuery, "stop_reason");
                int iA23 = b6.b.a(cursorQuery, "trace_tag");
                int iA24 = b6.b.a(cursorQuery, "required_network_type");
                int iA25 = b6.b.a(cursorQuery, "required_network_request");
                int iA26 = b6.b.a(cursorQuery, "requires_charging");
                int iA27 = b6.b.a(cursorQuery, "requires_device_idle");
                int iA28 = b6.b.a(cursorQuery, "requires_battery_not_low");
                int iA29 = b6.b.a(cursorQuery, "requires_storage_not_low");
                int iA30 = b6.b.a(cursorQuery, "trigger_content_update_delay");
                int iA31 = b6.b.a(cursorQuery, "trigger_max_content_delay");
                int iA32 = b6.b.a(cursorQuery, "content_uri_triggers");
                int i10 = iA14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(iA);
                    t6.c0 c0VarE = c7.m0.e(cursorQuery.getInt(iA2));
                    String string2 = cursorQuery.getString(iA3);
                    String string3 = cursorQuery.getString(iA4);
                    androidx.work.b bVarA = androidx.work.b.a(cursorQuery.getBlob(iA5));
                    androidx.work.b bVarA2 = androidx.work.b.a(cursorQuery.getBlob(iA6));
                    long j10 = cursorQuery.getLong(iA7);
                    long j11 = cursorQuery.getLong(iA8);
                    long j12 = cursorQuery.getLong(iA9);
                    int i11 = cursorQuery.getInt(iA10);
                    t6.a aVarB = c7.m0.b(cursorQuery.getInt(iA11));
                    long j13 = cursorQuery.getLong(iA12);
                    long j14 = cursorQuery.getLong(iA13);
                    int i12 = i10;
                    long j15 = cursorQuery.getLong(i12);
                    int i13 = iA12;
                    int i14 = iA15;
                    long j16 = cursorQuery.getLong(i14);
                    iA15 = i14;
                    int i15 = iA16;
                    boolean z10 = cursorQuery.getInt(i15) != 0;
                    iA16 = i15;
                    int i16 = iA17;
                    t6.b0 b0VarD = c7.m0.d(cursorQuery.getInt(i16));
                    iA17 = i16;
                    int i17 = iA18;
                    int i18 = cursorQuery.getInt(i17);
                    iA18 = i17;
                    int i19 = iA19;
                    int i20 = cursorQuery.getInt(i19);
                    iA19 = i19;
                    int i21 = iA20;
                    long j17 = cursorQuery.getLong(i21);
                    iA20 = i21;
                    int i22 = iA21;
                    int i23 = cursorQuery.getInt(i22);
                    iA21 = i22;
                    int i24 = iA22;
                    int i25 = cursorQuery.getInt(i24);
                    iA22 = i24;
                    int i26 = iA23;
                    String string4 = cursorQuery.isNull(i26) ? null : cursorQuery.getString(i26);
                    iA23 = i26;
                    int i27 = iA24;
                    t6.t tVarC = c7.m0.c(cursorQuery.getInt(i27));
                    iA24 = i27;
                    int i28 = iA25;
                    o oVarG = c7.m0.g(cursorQuery.getBlob(i28));
                    iA25 = i28;
                    int i29 = iA26;
                    boolean z11 = cursorQuery.getInt(i29) != 0;
                    iA26 = i29;
                    int i30 = iA27;
                    boolean z12 = cursorQuery.getInt(i30) != 0;
                    iA27 = i30;
                    int i31 = iA28;
                    boolean z13 = cursorQuery.getInt(i31) != 0;
                    iA28 = i31;
                    int i32 = iA29;
                    boolean z14 = cursorQuery.getInt(i32) != 0;
                    iA29 = i32;
                    int i33 = iA30;
                    long j18 = cursorQuery.getLong(i33);
                    iA30 = i33;
                    int i34 = iA31;
                    long j19 = cursorQuery.getLong(i34);
                    iA31 = i34;
                    int i35 = iA32;
                    iA32 = i35;
                    arrayList.add(new WorkSpec(string, c0VarE, string2, string3, bVarA, bVarA2, j10, j11, j12, new e(oVarG, tVarC, z11, z12, z13, z14, j18, j19, c7.m0.a(cursorQuery.getBlob(i35))), i11, aVarB, j13, j14, j15, j16, z10, b0VarD, i18, i20, j17, i23, i25, string4));
                    iA12 = i13;
                    i10 = i12;
                }
                cursorQuery.close();
                m0Var.z();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                m0Var.z();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            m0Var = m0VarP;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void p(int i10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        x xVar = this.f3206n;
        f fVarA = xVar.a();
        fVarA.d(1, i10);
        fVarA.o(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            xVar.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList q() throws Throwable {
        m0 m0Var;
        m0 m0VarP = m0.p(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            int iA = b6.b.a(cursorQuery, "id");
            int iA2 = b6.b.a(cursorQuery, "state");
            int iA3 = b6.b.a(cursorQuery, "worker_class_name");
            int iA4 = b6.b.a(cursorQuery, "input_merger_class_name");
            int iA5 = b6.b.a(cursorQuery, "input");
            int iA6 = b6.b.a(cursorQuery, "output");
            int iA7 = b6.b.a(cursorQuery, "initial_delay");
            int iA8 = b6.b.a(cursorQuery, "interval_duration");
            int iA9 = b6.b.a(cursorQuery, "flex_duration");
            int iA10 = b6.b.a(cursorQuery, "run_attempt_count");
            int iA11 = b6.b.a(cursorQuery, "backoff_policy");
            int iA12 = b6.b.a(cursorQuery, "backoff_delay_duration");
            int iA13 = b6.b.a(cursorQuery, "last_enqueue_time");
            m0Var = m0VarP;
            try {
                int iA14 = b6.b.a(cursorQuery, "minimum_retention_duration");
                int iA15 = b6.b.a(cursorQuery, "schedule_requested_at");
                int iA16 = b6.b.a(cursorQuery, "run_in_foreground");
                int iA17 = b6.b.a(cursorQuery, "out_of_quota_policy");
                int iA18 = b6.b.a(cursorQuery, "period_count");
                int iA19 = b6.b.a(cursorQuery, "generation");
                int iA20 = b6.b.a(cursorQuery, "next_schedule_time_override");
                int iA21 = b6.b.a(cursorQuery, "next_schedule_time_override_generation");
                int iA22 = b6.b.a(cursorQuery, "stop_reason");
                int iA23 = b6.b.a(cursorQuery, "trace_tag");
                int iA24 = b6.b.a(cursorQuery, "required_network_type");
                int iA25 = b6.b.a(cursorQuery, "required_network_request");
                int iA26 = b6.b.a(cursorQuery, "requires_charging");
                int iA27 = b6.b.a(cursorQuery, "requires_device_idle");
                int iA28 = b6.b.a(cursorQuery, "requires_battery_not_low");
                int iA29 = b6.b.a(cursorQuery, "requires_storage_not_low");
                int iA30 = b6.b.a(cursorQuery, "trigger_content_update_delay");
                int iA31 = b6.b.a(cursorQuery, "trigger_max_content_delay");
                int iA32 = b6.b.a(cursorQuery, "content_uri_triggers");
                int i10 = iA14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(iA);
                    t6.c0 c0VarE = c7.m0.e(cursorQuery.getInt(iA2));
                    String string2 = cursorQuery.getString(iA3);
                    String string3 = cursorQuery.getString(iA4);
                    androidx.work.b bVarA = androidx.work.b.a(cursorQuery.getBlob(iA5));
                    androidx.work.b bVarA2 = androidx.work.b.a(cursorQuery.getBlob(iA6));
                    long j10 = cursorQuery.getLong(iA7);
                    long j11 = cursorQuery.getLong(iA8);
                    long j12 = cursorQuery.getLong(iA9);
                    int i11 = cursorQuery.getInt(iA10);
                    t6.a aVarB = c7.m0.b(cursorQuery.getInt(iA11));
                    long j13 = cursorQuery.getLong(iA12);
                    long j14 = cursorQuery.getLong(iA13);
                    int i12 = i10;
                    long j15 = cursorQuery.getLong(i12);
                    int i13 = iA12;
                    int i14 = iA15;
                    long j16 = cursorQuery.getLong(i14);
                    iA15 = i14;
                    int i15 = iA16;
                    boolean z10 = cursorQuery.getInt(i15) != 0;
                    iA16 = i15;
                    int i16 = iA17;
                    t6.b0 b0VarD = c7.m0.d(cursorQuery.getInt(i16));
                    iA17 = i16;
                    int i17 = iA18;
                    int i18 = cursorQuery.getInt(i17);
                    iA18 = i17;
                    int i19 = iA19;
                    int i20 = cursorQuery.getInt(i19);
                    iA19 = i19;
                    int i21 = iA20;
                    long j17 = cursorQuery.getLong(i21);
                    iA20 = i21;
                    int i22 = iA21;
                    int i23 = cursorQuery.getInt(i22);
                    iA21 = i22;
                    int i24 = iA22;
                    int i25 = cursorQuery.getInt(i24);
                    iA22 = i24;
                    int i26 = iA23;
                    String string4 = cursorQuery.isNull(i26) ? null : cursorQuery.getString(i26);
                    iA23 = i26;
                    int i27 = iA24;
                    t6.t tVarC = c7.m0.c(cursorQuery.getInt(i27));
                    iA24 = i27;
                    int i28 = iA25;
                    o oVarG = c7.m0.g(cursorQuery.getBlob(i28));
                    iA25 = i28;
                    int i29 = iA26;
                    boolean z11 = cursorQuery.getInt(i29) != 0;
                    iA26 = i29;
                    int i30 = iA27;
                    boolean z12 = cursorQuery.getInt(i30) != 0;
                    iA27 = i30;
                    int i31 = iA28;
                    boolean z13 = cursorQuery.getInt(i31) != 0;
                    iA28 = i31;
                    int i32 = iA29;
                    boolean z14 = cursorQuery.getInt(i32) != 0;
                    iA29 = i32;
                    int i33 = iA30;
                    long j18 = cursorQuery.getLong(i33);
                    iA30 = i33;
                    int i34 = iA31;
                    long j19 = cursorQuery.getLong(i34);
                    iA31 = i34;
                    int i35 = iA32;
                    iA32 = i35;
                    arrayList.add(new WorkSpec(string, c0VarE, string2, string3, bVarA, bVarA2, j10, j11, j12, new e(oVarG, tVarC, z11, z12, z13, z14, j18, j19, c7.m0.a(cursorQuery.getBlob(i35))), i11, aVarB, j13, j14, j15, j16, z10, b0VarD, i18, i20, j17, i23, i25, string4));
                    iA12 = i13;
                    i10 = i12;
                }
                cursorQuery.close();
                m0Var.z();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                m0Var.z();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            m0Var = m0VarP;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final t6.c0 r(String str) {
        m0 m0VarP = m0.p(1, "SELECT state FROM workspec WHERE id=?");
        m0VarP.o(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        t6.c0 c0VarE = null;
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            if (cursorQuery.moveToFirst()) {
                Integer numValueOf = cursorQuery.isNull(0) ? null : Integer.valueOf(cursorQuery.getInt(0));
                if (numValueOf != null) {
                    c0VarE = c7.m0.e(numValueOf.intValue());
                }
            }
            return c0VarE;
        } finally {
            cursorQuery.close();
            m0VarP.z();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final WorkSpec s(String str) throws Throwable {
        m0 m0Var;
        WorkSpec workSpec;
        m0 m0VarP = m0.p(1, "SELECT * FROM workspec WHERE id=?");
        m0VarP.o(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            int iA = b6.b.a(cursorQuery, "id");
            int iA2 = b6.b.a(cursorQuery, "state");
            int iA3 = b6.b.a(cursorQuery, "worker_class_name");
            int iA4 = b6.b.a(cursorQuery, "input_merger_class_name");
            int iA5 = b6.b.a(cursorQuery, "input");
            int iA6 = b6.b.a(cursorQuery, "output");
            int iA7 = b6.b.a(cursorQuery, "initial_delay");
            int iA8 = b6.b.a(cursorQuery, "interval_duration");
            int iA9 = b6.b.a(cursorQuery, "flex_duration");
            int iA10 = b6.b.a(cursorQuery, "run_attempt_count");
            int iA11 = b6.b.a(cursorQuery, "backoff_policy");
            int iA12 = b6.b.a(cursorQuery, "backoff_delay_duration");
            int iA13 = b6.b.a(cursorQuery, "last_enqueue_time");
            m0Var = m0VarP;
            try {
                int iA14 = b6.b.a(cursorQuery, "minimum_retention_duration");
                int iA15 = b6.b.a(cursorQuery, "schedule_requested_at");
                int iA16 = b6.b.a(cursorQuery, "run_in_foreground");
                int iA17 = b6.b.a(cursorQuery, "out_of_quota_policy");
                int iA18 = b6.b.a(cursorQuery, "period_count");
                int iA19 = b6.b.a(cursorQuery, "generation");
                int iA20 = b6.b.a(cursorQuery, "next_schedule_time_override");
                int iA21 = b6.b.a(cursorQuery, "next_schedule_time_override_generation");
                int iA22 = b6.b.a(cursorQuery, "stop_reason");
                int iA23 = b6.b.a(cursorQuery, "trace_tag");
                int iA24 = b6.b.a(cursorQuery, "required_network_type");
                int iA25 = b6.b.a(cursorQuery, "required_network_request");
                int iA26 = b6.b.a(cursorQuery, "requires_charging");
                int iA27 = b6.b.a(cursorQuery, "requires_device_idle");
                int iA28 = b6.b.a(cursorQuery, "requires_battery_not_low");
                int iA29 = b6.b.a(cursorQuery, "requires_storage_not_low");
                int iA30 = b6.b.a(cursorQuery, "trigger_content_update_delay");
                int iA31 = b6.b.a(cursorQuery, "trigger_max_content_delay");
                int iA32 = b6.b.a(cursorQuery, "content_uri_triggers");
                if (cursorQuery.moveToFirst()) {
                    workSpec = new WorkSpec(cursorQuery.getString(iA), c7.m0.e(cursorQuery.getInt(iA2)), cursorQuery.getString(iA3), cursorQuery.getString(iA4), androidx.work.b.a(cursorQuery.getBlob(iA5)), androidx.work.b.a(cursorQuery.getBlob(iA6)), cursorQuery.getLong(iA7), cursorQuery.getLong(iA8), cursorQuery.getLong(iA9), new e(c7.m0.g(cursorQuery.getBlob(iA25)), c7.m0.c(cursorQuery.getInt(iA24)), cursorQuery.getInt(iA26) != 0, cursorQuery.getInt(iA27) != 0, cursorQuery.getInt(iA28) != 0, cursorQuery.getInt(iA29) != 0, cursorQuery.getLong(iA30), cursorQuery.getLong(iA31), c7.m0.a(cursorQuery.getBlob(iA32))), cursorQuery.getInt(iA10), c7.m0.b(cursorQuery.getInt(iA11)), cursorQuery.getLong(iA12), cursorQuery.getLong(iA13), cursorQuery.getLong(iA14), cursorQuery.getLong(iA15), cursorQuery.getInt(iA16) != 0, c7.m0.d(cursorQuery.getInt(iA17)), cursorQuery.getInt(iA18), cursorQuery.getInt(iA19), cursorQuery.getLong(iA20), cursorQuery.getInt(iA21), cursorQuery.getInt(iA22), cursorQuery.isNull(iA23) ? null : cursorQuery.getString(iA23));
                } else {
                    workSpec = null;
                }
                cursorQuery.close();
                m0Var.z();
                return workSpec;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                m0Var.z();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            m0Var = m0VarP;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int t(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        q qVar = this.f3202j;
        f fVarA = qVar.a();
        fVarA.o(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iQ = fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
                return iQ;
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            qVar.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int u(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        d0 d0Var = this.f3197e;
        f fVarA = d0Var.a();
        fVarA.o(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iQ = fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
                return iQ;
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            d0Var.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList v(String str) {
        m0 m0VarP = m0.p(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        m0VarP.o(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(androidx.work.b.a(cursorQuery.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            m0VarP.z();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int w(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        h0 h0Var = this.f3201i;
        f fVarA = h0Var.a();
        fVarA.o(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iQ = fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
                return iQ;
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            h0Var.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int x(t6.c0 c0Var, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        c0 c0Var2 = this.f3196d;
        f fVarA = c0Var2.a();
        fVarA.d(1, c7.m0.f(c0Var));
        fVarA.o(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iQ = fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
                return iQ;
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            c0Var2.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int y() {
        m0 m0VarP = m0.p(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            m0VarP.z();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int z() {
        WorkDatabase_Impl workDatabase_Impl = this.f3193a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        u uVar = this.f3205m;
        f fVarA = uVar.a();
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iQ = fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
                return iQ;
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            uVar.c(fVarA);
        }
    }
}
