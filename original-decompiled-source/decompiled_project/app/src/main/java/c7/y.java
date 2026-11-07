package c7;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.b;
import androidx.work.impl.model.WorkSpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import t6.e;

/* loaded from: classes.dex */
public final class y extends androidx.room.g<WorkSpec> {
    @Override // androidx.room.o0
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    /* JADX WARN: Finally extract failed */
    @Override // androidx.room.g
    public final void d(i6.f fVar, WorkSpec workSpec) throws IOException {
        int i10;
        int i11;
        int[] iArrB0;
        int[] iArrB02;
        byte[] byteArray;
        byte[] byteArray2;
        WorkSpec workSpec2 = workSpec;
        int i12 = 1;
        fVar.o(1, workSpec2.f3167a);
        fVar.d(2, m0.f(workSpec2.f3168b));
        fVar.o(3, workSpec2.f3169c);
        fVar.o(4, workSpec2.f3170d);
        androidx.work.b bVar = workSpec2.f3171e;
        androidx.work.b bVar2 = androidx.work.b.f3129b;
        fVar.L(5, b.C0046b.b(bVar));
        fVar.L(6, b.C0046b.b(workSpec2.f3172f));
        fVar.d(7, workSpec2.f3173g);
        fVar.d(8, workSpec2.f3174h);
        fVar.d(9, workSpec2.f3175i);
        fVar.d(10, workSpec2.f3177k);
        t6.a backoffPolicy = workSpec2.f3178l;
        kotlin.jvm.internal.r.e(backoffPolicy, "backoffPolicy");
        int iOrdinal = backoffPolicy.ordinal();
        if (iOrdinal == 0) {
            i10 = 0;
        } else {
            if (iOrdinal != 1) {
                throw new pg.l();
            }
            i10 = 1;
        }
        fVar.d(11, i10);
        fVar.d(12, workSpec2.f3179m);
        fVar.d(13, workSpec2.f3180n);
        fVar.d(14, workSpec2.f3181o);
        fVar.d(15, workSpec2.f3182p);
        fVar.d(16, workSpec2.f3183q ? 1L : 0L);
        t6.b0 policy = workSpec2.f3184r;
        kotlin.jvm.internal.r.e(policy, "policy");
        int iOrdinal2 = policy.ordinal();
        if (iOrdinal2 == 0) {
            i11 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new pg.l();
            }
            i11 = 1;
        }
        fVar.d(17, i11);
        fVar.d(18, workSpec2.f3185s);
        fVar.d(19, workSpec2.f3186t);
        fVar.d(20, workSpec2.f3187u);
        fVar.d(21, workSpec2.f3188v);
        fVar.d(22, workSpec2.f3189w);
        String str = workSpec2.f3190x;
        if (str == null) {
            fVar.e(23);
        } else {
            fVar.o(23, str);
        }
        t6.e eVar = workSpec2.f3176j;
        t6.t networkType = eVar.f28002a;
        kotlin.jvm.internal.r.e(networkType, "networkType");
        int iOrdinal3 = networkType.ordinal();
        if (iOrdinal3 == 0) {
            i12 = 0;
        } else if (iOrdinal3 != 1) {
            if (iOrdinal3 == 2) {
                i12 = 2;
            } else if (iOrdinal3 == 3) {
                i12 = 3;
            } else if (iOrdinal3 == 4) {
                i12 = 4;
            } else {
                if (Build.VERSION.SDK_INT < 30 || networkType != t6.t.f28057f) {
                    throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                }
                i12 = 5;
            }
        }
        fVar.d(24, i12);
        d7.o requestCompat = eVar.f28003b;
        kotlin.jvm.internal.r.e(requestCompat, "requestCompat");
        int i13 = Build.VERSION.SDK_INT;
        NetworkRequest networkRequest = (NetworkRequest) requestCompat.f7391a;
        if (networkRequest == null) {
            byteArray = new byte[0];
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    if (i13 >= 31) {
                        iArrB0 = networkRequest.getTransportTypes();
                        kotlin.jvm.internal.r.d(iArrB0, "request.transportTypes");
                    } else {
                        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
                        ArrayList arrayList = new ArrayList();
                        for (int i14 = 0; i14 < 9; i14++) {
                            int i15 = iArr[i14];
                            if (networkRequest.hasTransport(i15)) {
                                arrayList.add(Integer.valueOf(i15));
                            }
                        }
                        iArrB0 = qg.x.b0(arrayList);
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        iArrB02 = networkRequest.getCapabilities();
                        kotlin.jvm.internal.r.d(iArrB02, "request.capabilities");
                    } else {
                        int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                        ArrayList arrayList2 = new ArrayList();
                        for (int i16 = 0; i16 < 29; i16++) {
                            int i17 = iArr2[i16];
                            if (networkRequest.hasCapability(i17)) {
                                arrayList2.add(Integer.valueOf(i17));
                            }
                        }
                        iArrB02 = qg.x.b0(arrayList2);
                    }
                    objectOutputStream.writeInt(iArrB0.length);
                    for (int i18 : iArrB0) {
                        objectOutputStream.writeInt(i18);
                    }
                    objectOutputStream.writeInt(iArrB02.length);
                    for (int i19 : iArrB02) {
                        objectOutputStream.writeInt(i19);
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.jvm.internal.r.d(byteArray, "outputStream.toByteArray()");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        fVar.L(25, byteArray);
        fVar.d(26, eVar.f28004c ? 1L : 0L);
        fVar.d(27, eVar.f28005d ? 1L : 0L);
        fVar.d(28, eVar.f28006e ? 1L : 0L);
        fVar.d(29, eVar.f28007f ? 1L : 0L);
        fVar.d(30, eVar.f28008g);
        fVar.d(31, eVar.f28009h);
        Set<e.a> triggers = eVar.f28010i;
        kotlin.jvm.internal.r.e(triggers, "triggers");
        if (triggers.isEmpty()) {
            byteArray2 = new byte[0];
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                try {
                    objectOutputStream2.writeInt(triggers.size());
                    for (e.a aVar : triggers) {
                        objectOutputStream2.writeUTF(aVar.f28011a.toString());
                        objectOutputStream2.writeBoolean(aVar.f28012b);
                    }
                    pg.f0 f0Var2 = pg.f0.f21461a;
                    objectOutputStream2.close();
                    byteArrayOutputStream2.close();
                    byteArray2 = byteArrayOutputStream2.toByteArray();
                    kotlin.jvm.internal.r.d(byteArray2, "outputStream.toByteArray()");
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } finally {
                    }
                }
            } finally {
            }
        }
        fVar.L(32, byteArray2);
    }
}
