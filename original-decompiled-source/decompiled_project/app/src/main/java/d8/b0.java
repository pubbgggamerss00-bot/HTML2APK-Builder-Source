package d8;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class b0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f7426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f7428c;

    public b0(e eVar, l lVar, String str) {
        this.f7426a = lVar;
        this.f7427b = str;
        Objects.requireNonNull(eVar);
        this.f7428c = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        r0 = r2.A(com.android.billingclient.api.b.f5621j, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0233  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() throws Exception {
        Exception exc;
        z0 z0VarA;
        List<Purchase> list;
        zzam zzamVar;
        int i10;
        int i11;
        Bundle bundleZzi;
        com.android.billingclient.api.a aVarA;
        zzie zzieVar;
        e eVar = this.f7428c;
        Exception exc2 = null;
        int i12 = 9;
        if (!eVar.q()) {
            zzie zzieVar2 = zzie.SERVICE_CONNECTION_NOT_READY;
            com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5621j;
            eVar.B(9, aVar, zzieVar2);
            this.f7426a.a(aVar, zzbt.zzk());
            return null;
        }
        String str = this.f7427b;
        if (TextUtils.isEmpty(str)) {
            zzc.zzn("BillingClient", "Please provide a valid product type.");
            zzie zzieVar3 = zzie.EMPTY_PRODUCT_TYPE;
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f5616e;
            eVar.B(9, aVar2, zzieVar3);
            this.f7426a.a(aVar2, zzbt.zzk());
            return null;
        }
        zzc.zzm("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z10 = eVar.f7461n;
        eVar.f7471x.getClass();
        eVar.f7471x.getClass();
        long jLongValue = eVar.A.longValue();
        Bundle bundle = new Bundle();
        zzc.zzc(bundle, eVar.f7450c, eVar.f7451d, jLongValue);
        if (z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        String string = null;
        while (true) {
            try {
                synchronized (eVar.f7448a) {
                    try {
                        zzamVar = eVar.f7456i;
                    } catch (Throwable th2) {
                        th = th2;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    z0VarA = eVar.A(com.android.billingclient.api.b.f5621j, zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e);
                                    list = z0VarA.f7577a;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e11) {
                                    e = e11;
                                    z0VarA = eVar.A(com.android.billingclient.api.b.f5619h, zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e);
                                    list = z0VarA.f7577a;
                                    if (list != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                if (zzamVar == null) {
                    break;
                }
                if (eVar.f7461n) {
                    if (eVar.f7470w) {
                        i11 = 26;
                    } else if (eVar.f7469v) {
                        i11 = 24;
                    } else if (eVar.f7466s) {
                        i11 = 19;
                    } else {
                        i10 = i12;
                        bundleZzi = zzamVar.zzi(i10, eVar.f7454g.getPackageName(), str, string, bundle);
                    }
                    i10 = i11;
                    bundleZzi = zzamVar.zzi(i10, eVar.f7454g.getPackageName(), str, string, bundle);
                } else {
                    bundleZzi = zzamVar.zzh(3, eVar.f7454g.getPackageName(), str, string);
                }
                com.android.billingclient.api.a aVar3 = com.android.billingclient.api.b.f5619h;
                if (bundleZzi == null) {
                    zzc.zzn("BillingClient", "getPurchase() got null owned items list");
                    zzieVar = zzie.NULL_OWNED_ITEMS_LIST;
                } else {
                    int iZzb = zzc.zzb(bundleZzi, "BillingClient");
                    String strZzj = zzc.zzj(bundleZzi, "BillingClient");
                    a.C0062a c0062aA = com.android.billingclient.api.a.a();
                    c0062aA.f5609a = iZzb;
                    c0062aA.f5611c = strZzj;
                    aVarA = c0062aA.a();
                    if (iZzb != 0) {
                        zzc.zzn("BillingClient", "getPurchase() failed. Response code: " + iZzb);
                        zzieVar = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                    } else if (bundleZzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleZzi.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleZzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            zzc.zzn("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            zzieVar = zzie.NULL_SKUS_LIST;
                        } else if (stringArrayList2 == null) {
                            zzc.zzn("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            zzieVar = zzie.NULL_PURCHASES_LIST;
                        } else if (stringArrayList3 == null) {
                            zzc.zzn("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            zzieVar = zzie.NULL_SIGNATURES_LIST;
                        } else {
                            aVarA = com.android.billingclient.api.b.f5620i;
                            zzieVar = zzie.REASON_UNSPECIFIED;
                        }
                    } else {
                        zzc.zzn("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        zzieVar = zzie.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (aVarA == com.android.billingclient.api.b.f5620i) {
                        z0VarA = eVar.A(aVarA, zzieVar, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i13 = 0;
                    boolean z11 = false;
                    while (i13 < stringArrayList5.size()) {
                        String str2 = stringArrayList5.get(i13);
                        exc = exc2;
                        String str3 = stringArrayList6.get(i13);
                        ArrayList<String> arrayList2 = stringArrayList4;
                        zzc.zzm("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i13))));
                        try {
                            Purchase purchase = new Purchase(str2, str3);
                            if (TextUtils.isEmpty(purchase.c())) {
                                zzc.zzn("BillingClient", "BUG: empty/null token!");
                                z11 = true;
                            }
                            arrayList.add(purchase);
                            i13++;
                            exc2 = exc;
                            stringArrayList4 = arrayList2;
                        } catch (JSONException e12) {
                            z0VarA = eVar.A(com.android.billingclient.api.b.f5619h, zzie.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e12);
                        }
                    }
                    exc = exc2;
                    if (z11) {
                        i12 = 9;
                        eVar.B(9, aVar3, zzie.EMPTY_PURCHASE_TOKEN);
                    } else {
                        i12 = 9;
                    }
                    string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                    zzc.zzm("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                    if (TextUtils.isEmpty(string)) {
                        z0VarA = new z0(com.android.billingclient.api.b.f5620i, arrayList);
                        break;
                    }
                    exc2 = exc;
                }
                aVarA = aVar3;
                if (aVarA == com.android.billingclient.api.b.f5620i) {
                }
            } catch (DeadObjectException e13) {
                e = e13;
                exc = exc2;
            } catch (Exception e14) {
                e = e14;
                exc = exc2;
            }
        }
        list = z0VarA.f7577a;
        if (list != null) {
            this.f7426a.a(z0VarA.f7578b, list);
        } else {
            this.f7426a.a(z0VarA.f7578b, zzbt.zzk());
        }
        return exc;
    }
}
