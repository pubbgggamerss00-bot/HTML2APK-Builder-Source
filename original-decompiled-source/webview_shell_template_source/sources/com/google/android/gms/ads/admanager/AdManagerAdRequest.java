package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Builder extends AbstractAdRequestBuilder<Builder> {
        public Builder addCategoryExclusion(String str) {
            this.zza.zzn(str);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ AbstractAdRequestBuilder addCustomTargeting(String str, String str2) {
            addCustomTargeting(str, str2);
            return this;
        }

        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ AbstractAdRequestBuilder self() {
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.zza.zzB(str);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder addCustomTargeting(String str, String str2) {
            this.zza.zzp(str, str2);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder self() {
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ AbstractAdRequestBuilder addCustomTargeting(String str, List list) {
            addCustomTargeting(str, (List<String>) list);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.zza.zzp(str, TextUtils.join(",", list));
            }
            return this;
        }
    }

    public /* synthetic */ AdManagerAdRequest(Builder builder, zza zzaVar) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    public String getPublisherProvidedId() {
        return this.zza.zzl();
    }
}
