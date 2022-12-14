// Generated by view binder compiler. Do not edit!
package br.com.alexandre.bk.repositories.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.com.alexandre.bk.repositories.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRepoBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final Chip chipStar;

  @NonNull
  public final AppCompatImageView ivOwner;

  @NonNull
  public final MaterialTextView tvRepoDescription;

  @NonNull
  public final MaterialTextView tvRepoLanguage;

  @NonNull
  public final MaterialTextView tvRepoName;

  private ItemRepoBinding(@NonNull MaterialCardView rootView, @NonNull Chip chipStar,
      @NonNull AppCompatImageView ivOwner, @NonNull MaterialTextView tvRepoDescription,
      @NonNull MaterialTextView tvRepoLanguage, @NonNull MaterialTextView tvRepoName) {
    this.rootView = rootView;
    this.chipStar = chipStar;
    this.ivOwner = ivOwner;
    this.tvRepoDescription = tvRepoDescription;
    this.tvRepoLanguage = tvRepoLanguage;
    this.tvRepoName = tvRepoName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRepoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRepoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_repo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRepoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chip_star;
      Chip chipStar = ViewBindings.findChildViewById(rootView, id);
      if (chipStar == null) {
        break missingId;
      }

      id = R.id.iv_owner;
      AppCompatImageView ivOwner = ViewBindings.findChildViewById(rootView, id);
      if (ivOwner == null) {
        break missingId;
      }

      id = R.id.tv_repo_description;
      MaterialTextView tvRepoDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvRepoDescription == null) {
        break missingId;
      }

      id = R.id.tv_repo_language;
      MaterialTextView tvRepoLanguage = ViewBindings.findChildViewById(rootView, id);
      if (tvRepoLanguage == null) {
        break missingId;
      }

      id = R.id.tv_repo_name;
      MaterialTextView tvRepoName = ViewBindings.findChildViewById(rootView, id);
      if (tvRepoName == null) {
        break missingId;
      }

      return new ItemRepoBinding((MaterialCardView) rootView, chipStar, ivOwner, tvRepoDescription,
          tvRepoLanguage, tvRepoName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
