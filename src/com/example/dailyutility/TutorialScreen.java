package com.example.dailyutility;

import java.util.Locale;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class TutorialScreen extends FragmentActivity {
	
	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tut_screen);
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		SharedPreferences pref = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		Editor editor = pref.edit();
		editor.putBoolean("firstime", false);
		editor.commit();
		
	}

	public class SectionsPagerAdapter extends FragmentPagerAdapter {
		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			Fragment fragment = new InstructionHeaderFragment();
			Bundle args = new Bundle();
			args.putInt(InstructionHeaderFragment.ARG_SECTION_NUMBER,
					position + 1);
			fragment.setArguments(args);
			return fragment;
		}

		@Override
		public int getCount() {

			return 9;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return "Instructions";
			case 1:
				return "Tool 1";
			case 2:
				return "Tool 2";
			case 3:
				return "Tool 3";
			case 4:
				return "Tool 4";
			case 5:
				return "Tool 5";
			case 6:
				return "Tool 6";
			case 7:
				return "Tool 7";
			case 8:
				return "Tool 8";
			case 9:
				return "Tool 9";

			}
			return null;
		}
	}

	public static class InstructionHeaderFragment extends Fragment {

		public static final String ARG_SECTION_NUMBER = "section_number";

		public InstructionHeaderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_tut_screen,
					container, false);
			TextView Instructions = (TextView) rootView
					.findViewById(R.id.Instruction);
			Button exit = (Button) rootView.findViewById(R.id.button1);
			exit = (Button) rootView.findViewById(R.id.button1);
			exit.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					getActivity().finish();
				}
			});

			
			TextView instructionHead = (TextView) rootView
					.findViewById(R.id.InstructionHead);
			switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
			case 1:
				instructionHead.setText("INSTRUCTIONS");
				Instructions.setText("This Application Contains Various Tools.\nSwipe left To continue");
				break;
			case 2:
				instructionHead.setText("To Do List");
				Instructions.setText("Organize ur daily events with the facility of Alarm Remainder");
				break;
			case 3:
				instructionHead.setText("Weather Forecasting");
				Instructions.setText("Get Instant Weather Updates with a single click");
				break;
			case 4:
				instructionHead.setText("Location Tracker");
				Instructions.setText("Track any Nearby locations with ease");
				break;
			case 5:
				instructionHead.setText("Route Finder");
				Instructions.setText("Just enter ur Source and Destination and get the Route in Instant");
				break;
			case 6:
				instructionHead.setText("Compass");
				Instructions.setText("Confused of Directions? Let me help you");
				break;
			case 7:
				instructionHead.setText("Rescue Alerts");
				Instructions.setText("Select the contact and share ur location");
				break;
			case 8:
				instructionHead.setText("Emergency Helpline");
				Instructions.setText("A List of Emergency Contact Numbers");
				break;
			case 9:
				instructionHead.setText("FirstAid Guidelines");
				Instructions.setText("A list of basic First-Aid Tips that comes in handy");
				break;
			case 10:
				instructionHead.setText("BMI Calculator");
				Instructions.setText("Let me tell u whether u r healthy or not");
				break;
			default:
				break;
			}
			
			return rootView;
		}
	}

}
