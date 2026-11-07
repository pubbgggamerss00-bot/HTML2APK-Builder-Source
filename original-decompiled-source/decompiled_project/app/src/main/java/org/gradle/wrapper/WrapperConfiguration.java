package org.gradle.wrapper;

import com.yalantis.ucrop.view.CropImageView;
import java.net.URI;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/WrapperConfiguration.class */
public final class WrapperConfiguration {
    public URI distribution;
    public String distributionSha256Sum;
    public String distributionBase = "GRADLE_USER_HOME";
    public String distributionPath = "wrapper/dists";
    public String zipBase = "GRADLE_USER_HOME";
    public String zipPath = "wrapper/dists";
    public int networkTimeout = 10000;
    public boolean validateDistributionUrl = true;
    public int retries = 0;
    public int retryBackOffMs = CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION;

    public final void setDistribution(URI uri) {
        this.distribution = uri;
    }

    public final String getDistributionBase() {
        return this.distributionBase;
    }

    public final void setDistributionBase(String str) {
        this.distributionBase = str;
    }

    public final String getDistributionPath() {
        return this.distributionPath;
    }

    public final void setDistributionPath(String str) {
        this.distributionPath = str;
    }

    public final void setRetries(int i10) {
        this.retries = i10;
    }

    public final int getRetries() {
        return this.retries;
    }

    public final void setRetryBackOffMs(int i10) {
        this.retryBackOffMs = i10;
    }

    public final int getRetryBackOffMs() {
        return this.retryBackOffMs;
    }

    public final String getDistributionSha256Sum() {
        return this.distributionSha256Sum;
    }

    public final void setDistributionSha256Sum(String str) {
        this.distributionSha256Sum = str;
    }

    public final String getZipBase() {
        return this.zipBase;
    }

    public final void setZipBase(String str) {
        this.zipBase = str;
    }

    public final String getZipPath() {
        return this.zipPath;
    }

    public final void setZipPath(String str) {
        this.zipPath = str;
    }

    public final int getNetworkTimeout() {
        return this.networkTimeout;
    }

    public final void setNetworkTimeout(int i10) {
        this.networkTimeout = i10;
    }

    public final boolean getValidateDistributionUrl() {
        return this.validateDistributionUrl;
    }

    public final void setValidateDistributionUrl(boolean z10) {
        this.validateDistributionUrl = z10;
    }
}
