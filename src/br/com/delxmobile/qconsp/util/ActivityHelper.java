package br.com.delxmobile.qconsp.util;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import br.com.delxmobile.qconsp.R;
import br.com.delxmobile.qconsp.activities.DashboardActivity;

public class ActivityHelper {

	protected Activity mActivity;

	public ActivityHelper(Activity mActivity) {
		this.mActivity = mActivity;
	}

	/**
	 * Comes back to the DashBoard Screen and tell the system that it 
	 * can clean all the pull of activities from android. 
	 * 
	 */
	public void goHome() {
		if (mActivity instanceof DashboardActivity) {
			return;
		}

		final Intent intent = new Intent(mActivity, DashboardActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		mActivity.startActivity(intent);

	}

	/**
	 * Sets up the action bar with the given title and accent color. If title is
	 * null, then the app logo will be shown instead of a title. Otherwise, a
	 * home button and title are visible. If color is null, then the default
	 * colorstrip is visible.
	 */
	public void setupActionBar(CharSequence title) {
		final ViewGroup actionBarCompat = getActionBarCompat();
		if (actionBarCompat == null) {
			return;
		}

		LinearLayout.LayoutParams springLayoutParams = new LinearLayout.LayoutParams(
				0, ViewGroup.LayoutParams.FILL_PARENT);
		springLayoutParams.weight = 1;

		View.OnClickListener homeClickListener = new View.OnClickListener() {
			public void onClick(View view) {
				goHome();
			}
		};

		if (title != null) {
			// Add Home button
			addActionButtonCompat(R.drawable.ic_action_home,
					R.string.description_home_icon, homeClickListener, true);

			// Add title text
			TextView titleText = new TextView(mActivity, null,
					R.attr.actionbarCompatTextStyle);
			titleText.setLayoutParams(springLayoutParams);
			titleText.setText(title);
			actionBarCompat.addView(titleText);

		} else {
			ImageButton logo = new ImageButton(mActivity, null,
					R.attr.actionbarCompatLogoStyle);
			logo.setOnClickListener(homeClickListener);
			actionBarCompat.addView(logo);

			View spring = new View(mActivity);
			spring.setLayoutParams(springLayoutParams);
			actionBarCompat.addView(spring);
		}

	}

	/**
	 * Factory method for creating {@link ActivityHelper} objects for a given
	 * activity. Depending on which device the app is running, either a basic
	 * helper or Honeycomb-specific helper will be returned.
	 */
	public static ActivityHelper createInstance(Activity activity) {
		return new ActivityHelper(activity);
	}

	/**
	 * Returns the {@link ViewGroup} for the action bar on phones (compatibility
	 * action bar). Can return null, and will return null on Honeycomb.
	 */
	public ViewGroup getActionBarCompat() {
		return (ViewGroup) mActivity.findViewById(R.id.actionbar);
	}

	/**
	 * Sets the action bar title to the given string.
	 */
	public void setActionBarTitle(CharSequence title) {
		ViewGroup actionBar = getActionBarCompat();
		if (actionBar == null) {
			return;
		}

		TextView titleText = (TextView) actionBar
				.findViewById(R.id.actionbar_compat_text);
		if (titleText != null) {
			titleText.setText(title);
		}
	}

	/**
	 * Adds an action bar button to the compatibility action bar (on phones).
	 */
	public View addActionButtonCompat(int iconResId, int textResId,
			View.OnClickListener clickListener, boolean separatorAfter) {
		final ViewGroup actionBar = getActionBarCompat();
		if (actionBar == null) {
			return null;
		}

		// Create the separator
		// ImageView separator = new ImageView(mActivity, null,
		// R.attr.actionbarCompatSeparatorStyle);
		// separator.setLayoutParams(new ViewGroup.LayoutParams(2,
		// ViewGroup.LayoutParams.FILL_PARENT));

		// Create the button
		ImageButton actionButton = new ImageButton(mActivity, null,
				R.attr.actionbarCompatButtonStyle);
		actionButton.setLayoutParams(new ViewGroup.LayoutParams((int) mActivity
				.getResources().getDimension(R.dimen.actionbar_height),
				ViewGroup.LayoutParams.FILL_PARENT));
		actionButton.setImageResource(iconResId);
		actionButton.setScaleType(ImageView.ScaleType.CENTER);
		actionButton.setContentDescription(mActivity.getResources().getString(
				textResId));
		actionButton.setOnClickListener(clickListener);

		// Add separator and button to the action bar in the desired order

		// if (!separatorAfter) {
		// actionBar.addView(separator);
		// }

		actionBar.addView(actionButton);

		// if (separatorAfter) {
		// actionBar.addView(separator);
		// }

		return actionButton;
	}

}
