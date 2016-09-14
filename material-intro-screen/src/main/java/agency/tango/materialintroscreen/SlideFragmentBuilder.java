package agency.tango.materialintroscreen;

import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.view.View;

public class SlideFragmentBuilder {
    int backgroundColor;
    int buttonsColor;
    String title;
    String description;
    String messageButtonText;
    String[] neededPermissions;
    String[] possiblePermissions;
    int image;
    View.OnClickListener messageButtonClickListener = null;

    public SlideFragmentBuilder backgroundColor(@ColorRes int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public SlideFragmentBuilder buttonsColor(@ColorRes int buttonsColor) {
        this.buttonsColor = buttonsColor;
        return this;
    }

    public SlideFragmentBuilder title(String title) {
        this.title = title;
        return this;
    }

    public SlideFragmentBuilder description(String description) {
        this.description = description;
        return this;
    }

    public SlideFragmentBuilder neededPermissions(String[] neededPermissions) {
        this.neededPermissions = neededPermissions;
        return this;
    }

    public SlideFragmentBuilder possiblePermissions(String[] possiblePermissions) {
        this.possiblePermissions = possiblePermissions;
        return this;
    }

    public SlideFragmentBuilder image(@DrawableRes int image) {
        this.image = image;
        return this;
    }

    public SlideFragmentBuilder messageButtonText(String messageButtonText) {
        this.messageButtonText = messageButtonText;
        return this;
    }

    public SlideFragmentBuilder messageButtonClickListener(View.OnClickListener messageButtonClickListener) {
        this.messageButtonClickListener = messageButtonClickListener;
        return this;
    }

    public SlideFragment build() {
        return SlideFragment.createInstance(this);
    }
}
